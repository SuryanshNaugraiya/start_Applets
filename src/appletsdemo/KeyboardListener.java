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
        addKeyListener(this);
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

        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            x=x+5;
            repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            x=x-5;
            repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            y=y-5;
            repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y=y+5;
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
