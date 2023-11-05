import Buttons.LaunchMethods;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MainMenu implements ActionListener {

    String url;
    String path;

    JFrame frame = new JFrame();

    JButton netflixButton = new JButton("Watch Netflix");
    JButton youtubeButton = new JButton("Watch Youtube");
    JButton minecraftButton = new JButton("Play Minecraft");
    LaunchMethods a = new LaunchMethods();

    MainMenu() {

        netflixButton.setBounds(100, 80, 200, 40);
        netflixButton.setFocusable(false);
        netflixButton.addActionListener(this);

        youtubeButton.setBounds(100, 150, 200, 40);
        youtubeButton.setFocusable(false);
        youtubeButton.addActionListener(this);

        minecraftButton.setBounds(100, 220, 200, 40);
        minecraftButton.setFocusable(false);
        minecraftButton.addActionListener(this);

        frame.add(netflixButton);
        frame.add(youtubeButton);
        frame.add(minecraftButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==netflixButton) {
            String url = "https://www.netflix.com/browse";
            launchNetflix(url);

        }else if(e.getSource()==youtubeButton){
            String url = "https://www.youtube.com/";
            launchYoutube(url);
        }else if(e.getSource()==minecraftButton){
            String path = "C:\\Users\\grays\\AppData\\Local\\Programs\\launcher\\Lunar Client.exe";
        }

    }

    public static void launchNetflix(String url){
        Runtime rt = Runtime.getRuntime();
        try{
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void launchYoutube(String url){
        Runtime rt = Runtime.getRuntime();
        try{
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void launchLunarLauncher(String path){
        Runtime rt = Runtime.getRuntime();
        File file = new File(path);
        try{
            rt.exec("rundll32 url.dll,FileProtocolHandler " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
