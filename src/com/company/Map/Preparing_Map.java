package com.company.Map;

import com.company.Map.Map1.Map1;

import java.io.IOException;

/**
 * Created by Chetsada Chaiprasop on 10/20/2016.
 */
public class Preparing_Map {
    private Node_Map position=null;//show current map
    private Node_Map startPoint=null;//head list map
    //constructor
    public Preparing_Map() throws IOException {
        startPoint = new Node_Map(new Map1());
        position = startPoint;
    }
    //change map meteor
    public void movePosition_ToLeft()
    {
        position = position.getDirection_W();
    }

    public void movePosition_ToRight()
    {
        position = position.getDirection_E();
    }

    public void movePosition_ToUp()
    {
        position = position.getDirection_N();
    }

    public void movePosition_ToDown()
    {
        position = position.getDirection_S();
    }
    //show value meteor
    public Node_Map getPosition()
    {
        return this.position;
    }

    public Node_Map getStartPoint()
    {
        return this.startPoint;
    }
}
