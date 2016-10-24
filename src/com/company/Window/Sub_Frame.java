package com.company.Window;

import com.company.Map.Map1.Map1;
import com.company.Map.Node_Map;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

/**
 * Created by Chetsada Chaiprasop on 10/20/2016.
 */
public class Sub_Frame extends JPanel implements Runnable{
    private int width=500,height=500;
    private Thread th;
    private Map1 world = new Map1();

    public Sub_Frame() throws IOException {
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

    public void paint(Graphics g) {
        g.clearRect(0,0,width,height);
        g.setColor(Color.WHITE);
        g.fillRect(0,0,width,height);
        Node_Map temp = world.getPosition();
        try {
            temp.getMap().paintMap(g);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
