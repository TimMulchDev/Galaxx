/*
 * Developed by Kafloosi
 * Last modified: 08/10/18 14:26.
 * Copyright (c) 2018. All rights reserved
 */

package Login;

import ProjectTest.Application;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class LoginGalaxx extends Applet
{
    Label loginLabel, passwordLabel;
    TextField textLogin, textPassword;
    Button login, showPassword;
    String password, username, userInputPassword, userInputUsername;
    boolean showPasswordBool = true;

    Account accounts[] = new Account[5];
    Account curAccount;

    Screen curScreen;

    public static Image logo, csgo, gta, cityskylines, roblox, uch, koop, despacito;
    private URL path1, path2, path3, path4, path5, path6, path7, path8;

    public void init()
    {
        setSize(1920, 1080);

        path1 = Application.class.getResource("Resources/GalaxxNameLogo_V2.png");
        path2 = Application.class.getResource("Resources/csgo.jpg");
        path3 = Application.class.getResource("Resources/gta.jpg");
        path4 = Application.class.getResource("Resources/cityskyines.jpg");
        path5 = Application.class.getResource("Resources/roblox.jpg");
        path6 = Application.class.getResource("Resources/uch.jpg");
        path7 = Application.class.getResource("Resources/koop.png");
        path8 = Application.class.getResource("Resources/despacito.jpg");
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
            gta = ImageIO.read(path3);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            cityskylines = ImageIO.read(path3);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            roblox = ImageIO.read(path5);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            uch = ImageIO.read(path6);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            koop = ImageIO.read(path7);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            despacito = ImageIO.read(path8);
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
}