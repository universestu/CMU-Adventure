package com.company.Window;

import com.company.Map.Map1.Map1;
import com.company.Map.Node_Map;
import com.company.Sprite.Player.Player;

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
    //player
    private Player player = new Player();
    private int x = 250;
    private int y = 300;
    private int action = 1;
    private String player_movement ="NONE";

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
                    player_movement = "LEFT";
                    if(action>=4&&action<=6)
                    {
                        action++;
                        if(action>6) action =4;
                    }
                    else
                    {
                        action = 4;
                    }
                }
                if(e.getKeyCode()==KeyEvent.VK_RIGHT)
                {
                    player_movement = "RIGHT";
                    if(action>=7&&action<=9)
                    {
                        action++;
                        if(action>9) action =7;
                    }
                    else
                    {
                        action = 7;
                    }
                }
                if(e.getKeyCode()==KeyEvent.VK_UP)
                {
                    player_movement = "UP";
                    if(action>=10&&action<=12)
                    {
                        action++;
                        if(action>12) action =10;
                    }
                    else
                    {
                        action = 10;
                    }
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN)
                {
                    player_movement = "DOWN";
                    if(action>=1&&action<=3)
                    {
                        action++;
                        if(action>3) action =1;
                    }
                    else
                    {
                        action = 1;
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
        Node_Map temp = world.getPosition();
        try {
            temp.getMap().paintMap(g);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(player_movement == "LEFT") {
            x -= 10;
        }
        if(player_movement == "RIGHT") {
            x += 10;
        }
        if(player_movement == "UP") {
            y -= 10;
        }
        if(player_movement == "DOWN") {
            y += 10;
        }
        player.draw(x,y,action-1,g);
        player_movement = "NONE";
    }
}
