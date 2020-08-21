package appletsdemo;

import java.applet.Applet;
import java.awt.*;

public class MakingCar extends Applet {

    @Override
    public void start() {
        setSize(800,600);
        setBackground(Color.yellow);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(200,100,200,100);
        g.setColor(Color.black);
        g.fillRect(100,200,400,100);
        g.fillOval(150,300,50,50);
        g.fillOval(400,300,50,50);
    }
}
