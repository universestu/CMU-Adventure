package com.company.Map;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Chetsada Chaiprasop on 10/20/2016.
 */
public interface iMap {
    public  int width=500,height=500;
    public  int[][] status_Map = new int[50][50];
    //set property
    public void setStatus_Map();
    //path graphic
    public void paintMap(Graphics g) throws IOException;
    public void drawGrid(Graphics g);
    public void drawMap(Graphics g) throws IOException;
}
