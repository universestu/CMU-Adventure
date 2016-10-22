package system;

import map.*;//my create

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Chetsada Chaiprasop on 10/20/2016.
 */
public class Sub_Frame extends JPanel implements Runnable{
    private int width=500,height=500;
    private Thread th;
    private Preparing_Map world = new Preparing_Map();

    public Sub_Frame() {
        setPreferredSize(new Dimension(width,height));
        setBackground(Color.WHITE);
        th = new Thread(this);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_LEFT)
                {
                    Node_Map temp = world.getPosition();
                    if(temp.getDirection_W()!=null) {
                        world.movePosition_ToLeft();
                    }
                }
                if(e.getKeyCode()==KeyEvent.VK_RIGHT)
                {
                    Node_Map temp = world.getPosition();
                    if(temp.getDirection_E()!=null) {
                        world.movePosition_ToRight();
                    }
                }
                if(e.getKeyCode()==KeyEvent.VK_UP)
                {
                    Node_Map temp = world.getPosition();
                    if(temp.getDirection_N()!=null) {
                        world.movePosition_ToUp();
                    }
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN)
                {
                    Node_Map temp = world.getPosition();
                    if(temp.getDirection_S()!=null) {
                        world.movePosition_ToDown();
                    }
                }
                if(e.getKeyCode()==KeyEvent.VK_ESCAPE)
                {
                    System.exit(0);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setFocusable(true);
        th.start();
    }

    @Override
    public void run() {
        while (true)
        {
            repaint();
        }
    }

    public void paint(Graphics g2d)
    {
        g2d.clearRect(0,0,width,height);
        g2d.setColor(Color.BLUE);
        for(int i=0;i<width/10;i++)
        {
            g2d.drawLine(i*10,0,i*10,height);
        }
        for(int i=0;i<height/10;i++)
        {
            g2d.drawLine(0,i*10,width,i*10);
        }
        Node_Map temp = world.getPosition();
        temp.getMap().paintMap(g2d);
    }
}
