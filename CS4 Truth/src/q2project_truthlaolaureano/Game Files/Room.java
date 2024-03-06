import java.util.ArrayList;

public class Room {
    protected String description;
    protected int xLocation, yLocation;
    protected ArrayList<Item> items;
    protected boolean hasMonster, hasItems, isLocked, isFinalRoom;

    public Room(String d, int x, int y, boolean hm, boolean hi, boolean il, boolean ifr){
        this.description = d;
        this.xLocation = x;
        this.yLocation = y;
        this.hasMonster = hm;
        this.hasItems = hi;
        this.isLocked = il;
        this.isFinalRoom = ifr;
    }


    //getters and setters
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

    public boolean isLocked() {
        return isLocked;
    }

    public boolean isFinalRoom() {
        return isFinalRoom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setxLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public void setyLocation(int yLocation) {
        this.yLocation = yLocation;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void setHasMonster(boolean hasMonster) {
        this.hasMonster = hasMonster;
    }

    public void setHasItems(boolean hasItems) {
        this.hasItems = hasItems;
    }

    public void setLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public void setFinalRoom(boolean isFinalRoom) {
        this.isFinalRoom = isFinalRoom;
    }
    
}
