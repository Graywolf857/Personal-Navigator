import Buttons.NetflixButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainMenu {

    JFrame frame = new JFrame();

    JButton netflixButton = new JButton();

    MainMenu() {
        netflixButton.setBounds(100,160,200,40);
        netflixButton.setFocusable(false);
        netflixButton.addActionListener();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
