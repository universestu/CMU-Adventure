package com.company.Sprite.Forest;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Chetsada Chaiprasop on 10/24/2016.
 */
public class Forest extends JPanel {
    private ArrayList<BufferedImage> imgArr = new ArrayList<>();
    private ForestLoader path = new ForestLoader();

    public Forest() throws IOException {
        for(int i=0;i<11;i++)
        {
            imgArr.add(path.loadImage("forest"+(i+1)+".png"));
        }
    }

    public void draw(int x,int y,int index, Graphics g)
    {
        g.drawImage(imgArr.get(index),x,y,null);
    }

    public void tree01(int x,int y,Graphics g)
    {
        draw(x+30,y-29,1,g);
        draw(x+0,y-29,1,g);
        draw(x,y,2,g);
        draw(x+60,y+0,2,g);
        draw(x+30,y+0,2,g);
    }
}
