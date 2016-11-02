package com.company.Map.Map1;

import com.company.Map.Node_Map;

import java.io.IOException;

/**
 * Created by Chetsada Chaiprasop on 10/23/2016.
 */
public class Map1 {
    private Node_Map map = null;
    private Node_Map position = null;

    public Map1() throws IOException {
        map = new Node_Map(new Sub_map1());
        position = map;
    }

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

    public Node_Map getPosition()
    {
        return this.position;
    }
}
