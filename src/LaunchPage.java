import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton startButton = new JButton("What would you like to do?");

    LaunchPage(){

        startButton.setBounds(100,160,200,40);
        startButton.setFocusable(false);
        startButton.addActionListener(this);


        frame.add(startButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(750, 270);
        frame.setTitle("Welcome Gamer!");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == startButton){
            frame.dispose();
            MainMenu selectionMenu = new MainMenu();



        }

    }
}
