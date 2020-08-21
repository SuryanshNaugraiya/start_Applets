package appletsdemo;

import java.applet.Applet;
import java.awt.*;

public class MovingBall extends Applet implements Runnable{

    int x = 100 , y = 100;
    Thread t;

    @Override
    public void start() {
        setSize(800,600);
        setBackground(Color.yellow);
        t = new Thread(this);
        t.start();
    }

    @Override
    public void paint(Graphics g) {
        g.fillOval(x, y ,50,50);
    }

    @Override
    public void run() {

        while (true){

            try {

                Thread.sleep(100);
                x=x+5;
                y=y+5;
                System.out.println("x: "+x);
                System.out.println("y: "+y);
                repaint();

            }
            catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }
}
