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
    }
}
