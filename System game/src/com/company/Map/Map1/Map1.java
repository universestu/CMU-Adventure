package com.company.Map.Map1;

import com.company.Map.iMap;
import com.company.Sprite.Forest.Forest;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Chetsada Chaiprasop on 10/23/2016.
 */
public class Map1 extends JPanel implements iMap {
    private Forest forest;

    @Override
    public void paintMap(Graphics g) throws IOException {
        forest = new Forest();
        drawGrid(g);
        drawMap(g);
    }

    @Override
    public void drawGrid(Graphics g) {
        g.setColor(Color.BLUE);
        for(int i=0;i<width/10;i++)
        {
            g.drawLine(i*10,0,i*10,height);
        }
        for(int i=0;i<height/10;i++)
        {
            g.drawLine(0,i*10,width,i*10);
        }
    }

    @Override
    public void drawMap(Graphics g) throws IOException {
        //layer 1
        for (int j=-1;j<height/10;j+=2) {
            for (int i =-1;i<width/10;i+=2) {
                forest.draw(i*10,j*10,0,g);
            }
        }
        //layer2
        forest.tree01(450,0,g);
        forest.tree01(360,0,g);
        forest.tree01(270,0,g);
        forest.tree01(180,0,g);
        forest.tree01(90,0,g);
        forest.tree01(0,0,g);
        forest.draw(450,0,2,g);
        forest.draw(-30,0,2,g);

        forest.draw(0,470,6,g);
    }
}
