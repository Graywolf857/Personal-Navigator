
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainMenu implements ActionListener {

    String url;
    String path;

    JFrame frame = new JFrame();

    JButton netflixButton = new JButton("Watch Netflix");
    JButton youtubeButton = new JButton("Watch Youtube");
    JButton minecraftButton = new JButton("Play Minecraft");
    JButton ampButton = new JButton("Play Guitar");
    JButton musicButton = new JButton("Listen to music!");


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

        ampButton.setBounds(100, 290, 200, 40);
        ampButton.setFocusable(false);
        ampButton.addActionListener(this);


        musicButton.setBounds(100, 360, 200, 40);
        musicButton.setFocusable(false);
        musicButton.addActionListener(this);

        frame.add(netflixButton);
        frame.add(youtubeButton);
        frame.add(minecraftButton);
        frame.add(ampButton);
        frame.add(musicButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(750, 270);
        frame.setTitle("Main shit");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==netflixButton) {
            String url = "https://www.netflix.com/browse";
            launchNetflix(url);

        }else if(e.getSource()==youtubeButton){
            String url = "https://www.youtube.com/";
            launchYoutube(url);

        }else if(e.getSource()==minecraftButton) {
            String path = "C:\\Users\\grays\\AppData\\Local\\Programs\\launcher\\Lunar Client.exe";
            launchLunarLauncher(path);

        }else if (e.getSource()==ampButton) {
            String path = "C:\\Program Files\\Neural DSP\\Mesa Boogie Mark IIC+ Suite.exe";
            ampLauncher(path);
        }else if (e.getSource()==musicButton) {
            String path = "C:\\Users\\grays\\AppData\\Roaming\\Spotify\\Spotify.exe";
            musicLauncher(path);

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
        try{
            Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void ampLauncher(String path){
        Runtime rt = Runtime.getRuntime();
        try{
            Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void musicLauncher(String path){
        Runtime rt = Runtime.getRuntime();
        try{
            Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
