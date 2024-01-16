package q2project_truthlaolaureano;
import java.util.ArrayList;

public class Player {
    protected String name;
    protected int health, attack;
    private int xLocation, yLocation;
    private ArrayList<Item> inventory;

    public Player(int h, int a, int x, int y){
        this.health = h;
        this.attack = a;
        this.xLocation = x;
        this.yLocation = y;
    }

    public void attackMonster(Monster m){
        while(m.health > 0){
            m.health -= attack;
        }
    }

    public void move(String direction){
        //this assumes that 0,0 is in the bottom right corner of the map
        switch(direction){
            case "East":
                xLocation++;
                break;
            case "West":
                xLocation--;
                break;
            case "North":
                yLocation++;
                break;
            case "South":
                yLocation--;
                break;
        }
    }

    public void lootRoom(Room r){
        if (r.hasItems()){
            for (Item i : r.items){
                inventory.add(i);
            }
        } else {
            System.out.println("You search the room for anything you can find, yet there's nothing of value.");
        }
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
}
