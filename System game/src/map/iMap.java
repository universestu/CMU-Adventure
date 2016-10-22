package map;

import java.awt.*;

/**
 * Created by Chetsada Chaiprasop on 10/20/2016.
 */
public interface iMap {
    public  int width=500,height=500;

    public void paintMap(Graphics g);
    public void drawGrid(Graphics g);
    public void drawMap(Graphics g);
}
