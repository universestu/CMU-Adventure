package com.company.Sprite.Player;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Chetsada Chaiprasop on 11/1/2016.
 */
public class Player {
    private ArrayList<BufferedImage> imgArr = new ArrayList<>();
    private PlayerLoader path = new PlayerLoader();

    public Player() throws IOException {
        for(int i=0;i<12;i++)
        {
            imgArr.add(path.loadImage("player"+(i+1)+".png"));
        }
    }

    public void draw(int x,int y,int index, Graphics g)
    {
        g.drawImage(imgArr.get(index),x,y,null);
    }
}
