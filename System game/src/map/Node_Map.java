package map;

/**
 * Created by Chetsada Chaiprasop on 10/20/2016.
 */
public class Node_Map {
    private iMap map=null;
    private Node_Map N =null;
    private Node_Map S =null;
    private Node_Map W =null;
    private Node_Map E =null;

    public Node_Map(iMap map)
    {
        this.map=map;
    }

    public void setDirection_N(iMap next_Map)
    {
        Node_Map temp = new Node_Map(next_Map);
        this.N = temp;
        temp.setDirection_S(this);
    }

    public void setDirection_S(iMap next_Map)
    {
        Node_Map temp = new Node_Map(next_Map);
        this.S = temp;
        temp.setDirection_N(this);
    }

    public void setDirection_W(iMap next_Map)
    {
        Node_Map temp = new Node_Map(next_Map);
        this.W = temp;
        temp.setDirection_E(this);
    }

    public void setDirection_E(iMap next_Map)
    {
        Node_Map temp = new Node_Map(next_Map);
        this.E = temp;
        temp.setDirection_W(this);
    }
    //over write meteor
    public void setDirection_N(Node_Map pre_Map)
    {
        this.N = pre_Map;
        pre_Map.S = this;
    }

    public void setDirection_S(Node_Map pre_Map)
    {
        this.S = pre_Map;
        pre_Map.N = this;
    }

    public void setDirection_W(Node_Map pre_Map)
    {
        this.W = pre_Map;
        pre_Map.E = this;
    }

    public void setDirection_E(Node_Map pre_Map)
    {
        this.E = pre_Map;
        pre_Map.W = this;
    }

    public Node_Map getDirection_N()
    {
        return this.N;
    }
    
    public Node_Map getDirection_S()
    {
        return this.S;
    }
    
    public Node_Map getDirection_W()
    {
        return this.W;
    }
    
    public Node_Map getDirection_E()
    {
        return this.E;
    }

    public iMap getMap()
    {
        return this.map;
    }
}
