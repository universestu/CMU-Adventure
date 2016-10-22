package map;

/**
 * Created by Chetsada Chaiprasop on 10/20/2016.
 */
public class Preparing_Map {
    private Node_Map position=null;//show current map
    private Node_Map startPoint=null;//head list map
    //constructor
    public Preparing_Map() {
        startPoint = new Node_Map(new Map01());
        startPoint.setDirection_N(new Map02());
        startPoint.setDirection_S(new Map03());
        startPoint.getDirection_N().setDirection_E(startPoint.getDirection_S());
        startPoint.setDirection_W(new Map04());
        startPoint.setDirection_E(new Map05());
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
