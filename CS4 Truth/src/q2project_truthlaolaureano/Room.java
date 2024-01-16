package q2project_truthlaolaureano;
import java.util.ArrayList;

public class Room {
    protected String description;
    protected int xLocation, yLocation;
    protected ArrayList<Item> items;
    protected boolean hasMonster, hasItems;

    public Room(String d, int x, int y, boolean hm, boolean hi){
        this.description = d;
        this.xLocation = x;
        this.yLocation = y;
        this.hasMonster = hm;
        this.hasItems = hi;
    }


    public String getDescription() {
        return description;
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public boolean hasMonster() {
        return hasMonster;
    }

    public boolean hasItems() {
        return hasItems;
    }

    
}
