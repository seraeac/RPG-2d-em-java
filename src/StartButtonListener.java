package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        CharacterCreationWindow characterCreationWindow = new CharacterCreationWindow();
        characterCreationWindow.setVisible(true);
    }
}
