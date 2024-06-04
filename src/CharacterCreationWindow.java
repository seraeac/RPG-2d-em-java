package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterCreationWindow extends JFrame {
    private JComboBox<String> classComboBox;
    private JTextField healthField;
    private JTextField strengthField;
    private JTextField dexterityField;
    private JComboBox<String> weaponComboBox;

    public CharacterCreationWindow() {
        setTitle("Create Character");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        panel.add(new JLabel("Class:"));
        classComboBox = new JComboBox<>(new String[]{"Mage", "Paladin", "Cleric"});
        classComboBox.addActionListener(new ClassComboBoxListener());
        panel.add(classComboBox);

        panel.add(new JLabel("Health:"));
        healthField = new JTextField();
        panel.add(healthField);

        panel.add(new JLabel("Strength:"));
        strengthField = new JTextField();
        panel.add(strengthField);

        panel.add(new JLabel("Dexterity:"));
        dexterityField = new JTextField();
        panel.add(dexterityField);

        panel.add(new JLabel("Weapon:"));
        weaponComboBox = new JComboBox<>();
        panel.add(weaponComboBox);

        updateWeaponOptions();

        JButton createButton = new JButton("Create Character");
        createButton.addActionListener(new CreateButtonListener());
        panel.add(createButton);

        add(panel);
    }

    private void updateWeaponOptions() {
        weaponComboBox.removeAllItems();
        String selectedClass = (String) classComboBox.getSelectedItem();
        if (selectedClass != null) {
            switch (selectedClass) {
                case "Mage":
                    weaponComboBox.addItem("Staff");
                    weaponComboBox.addItem("Wand");
                    break;
                case "Paladin":
                    weaponComboBox.addItem("Sword");
                    weaponComboBox.addItem("Hammer");
                    break;
                case "Cleric":
                    weaponComboBox.addItem("Mace");
                    weaponComboBox.addItem("Flail");
                    break;
            }
        }
    }

    private class ClassComboBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            updateWeaponOptions();
        }
    }

    private class CreateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedClass = (String) classComboBox.getSelectedItem();
            int health = Integer.parseInt(healthField.getText());
            int strength = Integer.parseInt(strengthField.getText());
            int dexterity = Integer.parseInt(dexterityField.getText());
            String selectedWeapon = (String) weaponComboBox.getSelectedItem();

            // Criação do personagem com base nos dados fornecidos
            Character character = new Character(selectedClass, health, strength, dexterity, selectedWeapon);

            // Exibir informações do personagem criado
            JOptionPane.showMessageDialog(null, "Character Created:\n" +
                    "Class: " + selectedClass + "\n" +
                    "Health: " + health + "\n" +
                    "Strength: " + strength + "\n" +
                    "Dexterity: " + dexterity + "\n" +
                    "Weapon: " + selectedWeapon);

            // Fechar a janela de criação de personagem
            dispose();
        }
    }
}

