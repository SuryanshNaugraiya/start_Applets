package appletsdemo;

import java.applet.Applet;
import java.awt.*;

public class KeyboardListener extends Applet {

    int x = 100 , y = 100;

    @Override
    public void start() {
        setSize(800,600);
        setBackground(Color.yellow);
    }

    @Override
    public void paint(Graphics g) {
        g.fillOval(x, y ,50,50);
    }
}
