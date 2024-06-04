package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    public GameWindow() {
        setTitle("RPG 2D Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton startButton = new JButton("Start");
        startButton.addActionListener((ActionListener) new StartButtonListener());

        panel.add(startButton, BorderLayout.CENTER);
        add(panel);
    }
}
