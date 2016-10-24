package com.company.Map;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Chetsada Chaiprasop on 10/20/2016.
 */
public interface iMap {
    public  int width=500,height=500;

    public void paintMap(Graphics g) throws IOException;
    public void drawGrid(Graphics g);
    public void drawMap(Graphics g) throws IOException;
}
