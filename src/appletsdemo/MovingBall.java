package appletsdemo;

import java.applet.Applet;
import java.awt.*;

public class MovingBall extends Applet implements Runnable{
    @Override
    public void start() {
        setSize(800,600);
        setBackground(Color.yellow);
    }

    @Override
    public void paint(Graphics g) {
        g.fillOval(100,100,50,50);
    }

    @Override
    public void run() {

    }
}
