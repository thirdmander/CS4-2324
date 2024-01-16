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
        m.health -= attack;
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
