package q2project_truthlaolaureano;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //can possibly be adjusted in the future through a setting asking the user to input their desired rows/columns
        int rows = 2;
        int columns = 2;

        /* 
        for map printing in the future, not used for scenarios
        Room[][] map = new Room[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            System.out.print("[]");
            }
            System.out.println();
        }
        */

        //r1 is starting room, r2 has a monster, r3 has items such as the key, potion, and weapon, r4 is the final room
        Room r1 = new Room("There's nothing here, except a doorway to the north and east.", 0, 0, false, false, false , false);
        Room r2 = new Room("There's nothing else here, except a doorway to the south and east.", 0, 1, false, false, false , false);
        Room r3 = new Room("You can vaguely see a chest to your left, it's dusty and seems to be easy to break open. You see a doorway to the north and west", 1, 0, true, true, false , false);
        Room r4 = new Room("The ladder to the surface can be seen! You've found the exit room!", 1, 1, false, false, true, true);

        /*
        alternative map, not used currently for scenarios
        ArrayList<ArrayList<Room>> map = new ArrayList<>(columns);

        for(int i=0; i < columns; i++) {
            map.add(new ArrayList<>(rows));
        }
        
        map.get(0).add(r2);
        map.get(0).add(r1);
        map.get(1).add(r4);
        map.get(1).add(r3);
        */

        Monster m1 = new Monster("Skeleton Fighter", "Skeleton", "It's bones rattle with an intent to kill.", 3, 6, true);
        Weapon w1 = new Weapon("Rusty Steel Shortsword", "It's a shortsword made out of steel, it looks as if it's been used before.", 2);
        Potion healthPot = new Potion("Potion of Healing", "It's a blood red liquid.", 3, 0);
        Key k1 = new Key("Silver Key", "It looks as if it opens something, but you're not sure what.", r4);

        //Scenario 1
        try {
            Player p1 = new Player(10, 4, 0, 0);

            Scanner s = new Scanner(System.in);
            System.out.println("Which direction do you go?");
            String direction = s.nextLine();

            p1.move(direction);

            System.out.println("Which direction do you go?");
            direction = s.nextLine();
            p1.move(direction);

            System.out.println(r2.getDescription());
            p1.lootRoom(r2);

        } catch (InvalidRoomException e) {
            System.out.println(e);
        } catch (InventoryFullException e) {
            System.out.println(e);
        }

        //Scenario 2
        try{
            Player p1 = new Player(10, 4, 1, 0);

            //assume the player has looted previous rooms and has added these items to the inventory
            p1.getInventory().add(w1);
            p1.getInventory().add(healthPot);

            p1.equipWeapon(w1);
            p1.move("East"); //the player moves into a room that has a monster
            System.out.printf("As you move into the room, you see in the center a %n, ready to fight.", m1.getKind());
            System.out.println(m1.getDescription());

            fight(p1, m1);

            p1.drinkPotion(healthPot);
            p1.lootRoom(r3);
            p1.move("West");

        } catch (InvalidRoomException e) {
            System.out.println(e);
        } catch (NotInInventoryException e) { 
            System.out.println(e);
        } catch (InventoryFullException e) {
            System.out.println(e);
        }

        //Scenario 3
        try{
            Player p1 = new Player(10, 4, 1, 0);
            p1.getInventory().add(k1);

            p1.move("East");
            System.out.println("The room is locked, and needs a silver key.");
            p1.useKey(k1, r4);
            p1.move("East");
            
            if(r4.isFinalRoom()){
                System.out.println("As you move into the room, you see the stairs leading to the surface. You've escaped Crete's Labyrinth!");
            }

        } catch(InvalidRoomException e) {
            System.out.println(e);
        } catch (NotInInventoryException e) {
            System.out.println(e);
        } catch (WrongKeyException e) {
            System.out.println(e);
        }
    }

    public static void fight(Player p, Monster m){
        while(p.getHealth() > 0 && m.isAlive()){
            p.attackMonster(m);
            m.attackPlayer(p);
        }

    }
}
