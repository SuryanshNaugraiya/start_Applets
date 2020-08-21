package appletsdemo;

import java.applet.Applet;
import java.awt.*;

public class Demo1 extends Applet {

    public void start(){
        setSize(500,400);
        setBackground(Color.yellow);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.drawString("My first demo", 100, 50);
        g.drawLine(100,200,100,0);

        g.fillRect(100,100,300,50);

    }
}
