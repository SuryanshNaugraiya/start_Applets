package appletsdemo;

import java.applet.Applet;
import java.awt.*;

public class Demo1 extends Applet {

    public void start(){
        setSize(500,400);
        setBackground(Color.yellow);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial",Font.BOLD,14));
    }
}
