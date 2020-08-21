package appletsdemo;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener extends Applet implements KeyListener {

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
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
