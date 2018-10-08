package ProjectTest;

import java.applet.Applet;
import java.awt.*;
import java.net.URL;

public class Application extends Applet {
    private Image galaxx;
    private URL path;

    public void init() {
        path = Application.class.getResource("Resources/");
        galaxx = getImage(path, "GalaxxNameLogo_V2.png");
    }

    public void paint(Graphics g) {
        setBackground(Color.decode("#1A212C"));
        setSize(1920, 1080);
        g.setColor(Color.decode("#1C1F23"));
        g.fillRect(100, 100, 1540, 980);
        g.setColor(Color.decode("#2A2E33"));
        g.fillRect(0, 820, 1920, 980);
        g.setColor(Color.decode("#2A2E33"));
        g.fillRect(0, 0, 20, 1080);
        g.setColor(Color.decode("#2A2E33"));
        g.fillRect(1715, 0, 23, 1080);
        g.drawString(path.toString(), 20, 10 );
        g.drawImage(galaxx, 20, 20, 300, 80, this);
    }
}
