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

    public void move(String direction) throws InvalidRoomException {
        //this assumes that 0,0 is in the bottom right corner of the map and it's a 2x2 grid
        //if the players x/y location is within the grids borders, they can move 
        switch(direction){
            case "East":
                if(xLocation < 1){
                    xLocation++;
                } else {
                    throw new InvalidRoomException("There is no valid room in that direction");
                }
                break; 
            case "West":
                if(xLocation > 0){
                    xLocation--;
                } else {
                    throw new InvalidRoomException("There is no valid room in that direction");
                }
                break;
            case "North":
                if(yLocation < 1){
                    yLocation++;
                } else {
                    throw new InvalidRoomException("There is no valid room in that direction");
                }
                break;
            case "South":
                if(yLocation > 0){
                    yLocation--;
                } else {
                    throw new InvalidRoomException("There is no valid room in that direction");
                }
                break;
        }
    }

    public void lootRoom(Room r) throws InventoryFullException{
        if (r.hasItems()){
            for (Item i : r.items){
                if(inventory.size() <= 6){
                    inventory.add(i);
                } else {
                    throw new InventoryFullException("Your inventory is full! Remove an item first.");
                }
            }
        } else {
            System.out.println("You search the room for anything you can find, yet there's nothing of value.");
        }
    }

    public void drinkPotion(Potion p) throws NotInInventoryException { 
        if(inventory.contains(p)){
            health += p.healthGained;
            attack += p.attackGained;

            if(p.healthGained > 0){
                System.out.printf("You drink a %s and get %n health.", p.name, p.healthGained);
            } 

            if(p.attackGained > 0){
                System.out.printf("You drink a %s and get %n health.", p.name, p.attackGained);
            }
        } else{
            throw new NotInInventoryException("You do not have this potion in your inventory.");
        }
    }

    public void equipWeapon(Weapon w) throws NotInInventoryException{
        if(inventory.contains(w)){
            attack += w.attackAdded;
            System.out.printf("You equip %s and get %n attack.", w.name, w.attackAdded);
        } else {
            throw new NotInInventoryException("You do not have this weapon in your inventory.");
        }
    }

    public void useKey(Key k, Room r) throws WrongKeyException, NotInInventoryException{
        if(inventory.contains(k)){
            if(k.unlocksRoom == r){
                r.isLocked = false;
            } else {
                throw new WrongKeyException("This key doesn't unlock the room. Use a different key.");
            }
        } else{
            throw new NotInInventoryException("You do not have this key in your inventory.");
        }
        
    }

    //getters and setters
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

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setxLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public void setyLocation(int yLocation) {
        this.yLocation = yLocation;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
    
}
