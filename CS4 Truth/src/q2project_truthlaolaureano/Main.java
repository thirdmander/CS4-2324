package q2project_truthlaolaureano;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //can possibly be adjusted in the future through a setting asking the user to input their desired rows/columns
        int rows = 2;
        int columns = 2;

        /* 
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
        Room r2 = new Room("There's nothing else here, except a doorway to the south and east.", 0, 1, true, false, false , false);
        Room r3 = new Room("You can vaguely see a chest to your left, it's dusty and seems to be easy to break open. You see a doorway to the north and west", 1, 0, false, true, false , false);
        Room r4 = new Room("The ladder to the surface can be seen! You've found the exit room!", 1, 1, false, false, true, true);

        ArrayList<ArrayList<Room>> map = new ArrayList<>(columns);

        for(int i=0; i < columns; i++) {
            map.add(new ArrayList<>(rows));
        }
        
        map.get(0).add(r2);
        map.get(0).add(r1);
        map.get(1).add(r4);
        map.get(1).add(r4);

        for(int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                System.out.println("[]");
            }
        }
        Player p1 = new Player(10, 3, 0, 0);

        //Scenario 1

    }
}
