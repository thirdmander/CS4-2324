package q2project_truthlaolaureano;
import java.util.ArrayList;

public class Player {
    protected int health, attack = 0;
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
}
