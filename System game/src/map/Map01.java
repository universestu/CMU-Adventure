package map;

import strite_test.ImageLoader;
import strite_test.SplitImage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Chetsada Chaiprasop on 10/20/2016.
 */
public class Map01 extends JPanel implements iMap {


    public Map01() {
    }

    @Override
    public void paintMap(Graphics g) {
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
    public void drawMap(Graphics g)
    {
        g.setColor(Color.black);
        //create edge
        g.fillRect(0,0,width,20);
        g.fillRect(0,height-20,width,20);
        g.fillRect(0,0,20,height);
        g.fillRect(width-20,0,20,height);
        //create gate
        g.setColor(Color.WHITE);
        g.fillRect(0,100,20,200);//W gate
        g.fillRect(100,height-20,140,20);//S gate
        g.fillRect(width-20,160,20,200);//E
        g.fillRect(90,0,110,20);//N gate

        g.setColor(Color.black);
        g.setFont(new Font("Tahoma",Font.BOLD,50));
        g.drawString("Room 1",150,200);
    }
}
