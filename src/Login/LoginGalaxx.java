/*
 * Developed by Kafloosi
 * Last modified: 08/10/18 14:26.
 * Copyright (c) 2018. All rights reserved
 */

package Login;

import ProjectTest.Application;
import ProjectTest.actions;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class LoginGalaxx extends Applet{
    int luukcsgo, luukgta, luukcityskylines, luukroblox, luukuch;
    String displayName;
    String displayNameext1;
    Button buy1, buy2, buy3, buy4, buy5;
    Label loginLabel, passwordLabel;
    TextField textLogin, textPassword;
    Button login, showPassword;
    String password, username, userInputPassword, userInputUsername;
    boolean showPasswordBool = true;
    Account accounts[] = new Account[5];
    Account curAccount;
    Screen curScreen;
    public static Image logo, csgo, csgolibrary, gta, gtalibrary, cityskylines, cityskylineslibrary, roblox, robloxlibrary, uch, uchlibrary, koop, despacito;
    private URL path1, path2, path3, path4, path5, path6, path7, path8, path9, path10, path11, path12, path13;

    public void init(){
        setSize(1920, 1080);
        path1 = Application.class.getResource("Resources/GalaxxNameLogo_V2.png");
        path2 = Application.class.getResource("Resources/csgo.jpg");
        path3 = Application.class.getResource("Resources/csgo_library.jpg");
        path4 = Application.class.getResource("Resources/gta.jpg");
        path5 = Application.class.getResource("Resources/gta_library.jpg");
        path6 = Application.class.getResource("Resources/cityskylines.jpg");
        path7 = Application.class.getResource("Resources/cityskylines_library.jpg");
        path8 = Application.class.getResource("Resources/roblox.jpg");
        path9 = Application.class.getResource("Resources/roblox_library.jpg");
        path10 = Application.class.getResource("Resources/uch.jpg");
        path11 = Application.class.getResource("Resources/uch_library.jpg");
        path12 = Application.class.getResource("Resources/koop.png");
        path13 = Application.class.getResource("Resources/despacito.jpg");
        try
        {
            logo = ImageIO.read(path1);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            csgo = ImageIO.read(path2);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            csgolibrary = ImageIO.read(path3);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            gta = ImageIO.read(path4);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            gtalibrary = ImageIO.read(path5);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            cityskylines = ImageIO.read(path6);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            cityskylineslibrary = ImageIO.read(path7);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            roblox = ImageIO.read(path8);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            robloxlibrary = ImageIO.read(path9);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            uch = ImageIO.read(path10);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            uchlibrary = ImageIO.read(path11);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            koop = ImageIO.read(path12);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            despacito = ImageIO.read(path13);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        loginLabel = new Label("Login");
        add(loginLabel);
        textLogin = new TextField();
        textLogin.setColumns(7);
        add(textLogin);
        passwordLabel = new Label("Password");
        add(passwordLabel);
        textPassword = new TextField();
        textPassword.setColumns(7);
        textPassword.setEchoChar('*');
        add(textPassword);
        showPassword = new Button("Show Password");
        showPassword.addActionListener(new ShowPasswordListener());
        add(showPassword);
        login = new Button("Login");
        login.addActionListener(new PasswordListener());
        add(login);
        curAccount = new Account("Nigel", "Wachtwoord123");
        accounts[0] = curAccount;
        curAccount = new Account("Luuk", "passw");
        accounts[1] = curAccount;
        System.out.println(curAccount.naam);
        System.out.println(curAccount.passw);

        displayName = "Kafloosi";
        displayNameext1 = "'s";
        buy1 = new Button();
        buy1.setLabel("CSGO");
        buy1.addActionListener(new LoginGalaxx.librarycsgoListener());
        buy2 = new Button();
        buy2.setLabel("GTA");
        buy2.addActionListener(new LoginGalaxx.librarygtaListener());
        buy3 = new Button();
        buy3.setLabel("CITY SKYLINES");
        buy3.addActionListener(new LoginGalaxx.librarycityskylinesListener());
        buy4 = new Button();
        buy4.setLabel("ROBLOX");
        buy4.addActionListener(new LoginGalaxx.libraryrobloxListener());
        buy5 = new Button();
        buy5.setLabel("UCH");
        buy5.addActionListener(new LoginGalaxx.libraryuchListener());
        add(buy1);
        add(buy2);
        add(buy3);
        add(buy4);
        add(buy5);
    }

    private void loadScreen(Screen screenLoad)
    {
        curScreen = screenLoad;
        curScreen.init();
    }

    public void paint(Graphics g)
    {
        if (curScreen != null) {
            curScreen.paint(g);
        }
    }

    class Account
    {
        public String naam;
        public String passw;

        public Account(String naam, String passw)
        {
            this.naam = naam;
            this.passw = passw;
        }
    }

    public class PasswordListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            userInputPassword = textPassword.getText();
            password = userInputPassword;

            userInputUsername = textLogin.getText();
            username = userInputUsername;

            for (Account account : accounts)
                if (account != null)
                    if (username.equals(account.naam)) {
                        System.out.println("Checking password");
                        if (password.equals(account.passw)) {
                            System.out.println("Logged in!");
                            loadScreen(new Application());
                            repaint();
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("Wrong password or username!");
                    }
        }
    }

    class ShowPasswordListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(showPasswordBool)
            {
                showPasswordBool = false;
                System.out.println(showPasswordBool);
                textPassword.setEchoChar((char)0);
                return;
            }
            showPasswordBool = true;
            textPassword.setEchoChar('*');
            System.out.println(showPasswordBool);
        }
    }

    class librarycsgoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            luukcsgo = luukcsgo + 1;
            if (luukcsgo == 2) {
                luukcsgo = 1;
                System.out.println("Oh no, it seems like " +displayName + " already owns csgo? If you believe this is an error, please create a ticket on htttps://www.galaxx.nl/ticket");
            } else {
                System.out.println("Thank you for your purchase! CS:GO has now been added to " +displayName +displayNameext1 + " libary!");
                LoginGalaxx.csgo = LoginGalaxx.csgolibrary;
            }
            repaint();
        }
    }

    class librarygtaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            luukgta = luukgta + 1;
            if (luukgta == 2) {
                luukgta = 1;
                System.out.println("Oh no, it seems like " +displayName + " already owns Grand Theft Auto V? If you believe this is an error, please create a ticket on htttps://www.galaxx.nl/ticket");
            } else {
                System.out.println("Thank you for your purchase! Grand Theft Auto V has now been added to " +displayName +displayNameext1 + " libary!");
                LoginGalaxx.gta = LoginGalaxx.gtalibrary;
            }
            repaint();
        }
    }

    class librarycityskylinesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            luukcityskylines = luukcityskylines + 1;
            if (luukcityskylines == 2) {
                luukcityskylines = 1;
                System.out.println("Oh no, it seems like " +displayName + " already owns City Skylines? If you believe this is an error, please create a ticket on htttps://www.galaxx.nl/ticket");
            } else {
                System.out.println("Thank you for your purchase! City Skylines: Galaxx Edition has now been added to " +displayName +displayNameext1 + " libary!");
                LoginGalaxx.cityskylines = LoginGalaxx.cityskylineslibrary;
            }
            repaint();
        }
    }

    class libraryrobloxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            luukroblox = luukroblox + 1;
            if (luukroblox == 2) {
                luukroblox = 1;
                System.out.println("Oh no, it seems like" +displayName + "already owns Roblox? If you believe this is an error, please create a ticket on htttps://www.galaxx.nl/ticket");
            } else {
                System.out.println("Thank you for your purchase! Roblox has now been added to " +displayName +displayNameext1 + " libary!");
                LoginGalaxx.roblox = LoginGalaxx.robloxlibrary;
            }
            repaint();
        }
    }

    class libraryuchListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            luukuch = luukuch + 1;
            if (luukuch == 2) {
                luukuch = 1;
                System.out.println("Oh no, it seems like" +displayName + "already owns UCH? If you believe this is an error, please create a ticket on htttps://www.galaxx.nl/ticket");
            } else {
                System.out.println("Thank you for your purchase! UCH has now been added to " +displayName +displayNameext1 + " libary!");
                LoginGalaxx.uch = LoginGalaxx.uchlibrary;
            }
            repaint();
        }
    }
}