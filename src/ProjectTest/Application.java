package ProjectTest;

import Login.LoginGalaxx;
import Login.Screen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Application extends Screen
{
    Button knop1;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.decode("#1A212C"));
        g.fillRect(0, 0, 1920, 1080);
        g.setColor(Color.decode("#1C1F23"));
        g.fillRect(100, 100, 1540, 980);
        g.setColor(Color.decode("#2A2E33"));
        g.fillRect(0, 820, 1920, 980);
        g.setColor(Color.decode("#2A2E33"));
        g.fillRect(0, 0, 20, 1080);
        g.setColor(Color.decode("#2A2E33"));
        g.fillRect(1715, 0, 23, 1080);
        g.drawImage(LoginGalaxx.logo, 20, 10, 300, 80, null);
        g.drawImage(LoginGalaxx.csgo, 120, 120, 300, 120, null);
        g.drawImage(LoginGalaxx.gta, 120, 260, 300, 120, null);
        g.drawImage(LoginGalaxx.cityskylines, 120, 400, 300, 120, null);
        g.drawImage(LoginGalaxx.roblox, 120, 540, 300, 120, null);
        g.drawImage(LoginGalaxx.uch, 120, 680, 300, 120, null);
        g.setColor(Color.white);
        g.drawString("Conter Stirk: Globaal offensive", 450, 180);
        g.drawString("Spend your hard earned money on skins and crates so we get rich and you get a .png on your gun!", 450, 200);
        g.drawImage(LoginGalaxx.koop, 450, 210, 70, 25, null);
        g.drawString("Grand theft minecraft: Rise of the diamonds", 450, 320);
        g.drawString("Play as a bad ass minecraft thief and kill innocent people to gain repspect (press F)", 450, 340);
        g.drawImage(LoginGalaxx.koop, 450, 350, 70, 25, null);
        g.drawString("City Skyliners: Galaxx Edition", 450, 460);
        g.drawString("build and destroy cities, be opperheimer, destroyer of worlds", 450, 480);
        g.drawImage(LoginGalaxx.koop, 450, 490, 70, 25, null);
        g.drawString("Roblooof", 450, 600);
        g.drawString("Ooof and go commit play with your friends. Deathpacito no more play game and earn robux", 450, 620);
        g.drawImage(LoginGalaxx.koop, 450, 630, 70, 25, null);
        g.drawString("Ultimate Chicken Horsify", 450, 740);
        g.drawString("The game is here, play with friends and have some fun!", 450, 760);
        g.drawImage(LoginGalaxx.koop, 450, 770, 70, 25, null);
        g.drawString("[+] Add game", 50, 860);
        g.drawString("[+] Show friends", 1600, 860);
        g.drawString("Downloading Conter Stirk: Globaal Offensive", 740, 850);
        g.drawString("58% - at 4.2 mb/s", 813, 862);
    }
}