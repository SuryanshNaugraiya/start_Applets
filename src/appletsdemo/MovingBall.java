package appletsdemo;

import java.applet.Applet;
import java.awt.*;

public class MovingBall extends Applet implements Runnable{
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

    @Override
    public void run() {

        try {

            Thread.sleep(100);
        }
        catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
