package com.company.Map.Map1;

import com.company.Map.iMap;
import com.company.Sprite.Forest.Forest;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Chetsada Chaiprasop on 10/24/2016.
 */
public class Sub_map1 extends JPanel implements iMap {
    private Forest forest;

    public Sub_map1() throws IOException {
        forest = new Forest();
        setStatus_Map();
    }

    @Override
    public void paintMap(Graphics g) throws IOException {
        //drawMap(g);
        //drawGrid(g);
        showStatus_Map(g);
    }

    @Override
    public void setStatus_Map() {
        //layer 1 ground
        for(int i=0;i<width/10;i++)
        {
            for(int j=0;j<height/10;j++)
            {
                status_Map[i][j] = 1;
            }
        }
        //layer 2 wall
        for(int i=0;i<width/10;i++)// up
        {
            for(int j=0;j<60/10;j++)
            {
                status_Map[i][j] = 0;
            }
        }
        for(int i=0;i<30/10;i++)// left
        {
            for(int j=0;j<height/10;j++)
            {
                status_Map[i][j] = 0;
            }
        }
        for(int i=470/10;i<width/10;i++)// right
        {
            for(int j=0;j<height/10;j++)
            {
                status_Map[i][j] = 0;
            }
        }
        for(int i=0;i<width/10;i++)//down
        {
            for(int j=480/10;j<height/10;j++)
            {
                status_Map[i][j] = 0;
            }
        }
        //object
    }

    @Override
    public void drawGrid(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(0,0,width,height);
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
        //layer 1 grass
        for(int j=-1;j<height/10;j+=2) {
            for (int i =-1;i<width/10;i+=2) {
                forest.draw(i*10,j*10,0,g);
            }
        }
        //layer2 forest wall
        for(int i=450;i>=0;i-=90)
        {
            forest.tree01(i,0,g);
        }
        forest.draw(450,0,2,g);
        forest.draw(-30,0,2,g);
        //layer3 object
    }

    private void showStatus_Map(Graphics g)
    {
        g.setColor(Color.orange);
        g.fillRect(0,0,width,height);
        g.setColor(Color.black);
        for(int i=0;i<width/10;i++)
        {
            for(int j=0;j<height/10;j++)
            {
                g.drawString(status_Map[i][j]+"",i*10,j*10);
            }
        }
    }
}
