package exercise09truthlaolaureano;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int notfound = 0;
        int alreadycaptured = 0;
        int fullteam = 0;
        int notinteam = 0;
        
        Trainer player = new Trainer("Steve");
        Monster m0 = new NormalType("Rattata", 15, 5);
        Monster m1 = new NormalType("Meowth", 15, 5);
        Monster m2 = new NormalType("Kangaskhan", 15, 5);
        Monster m3 = new NormalType("Tauros", 15, 5);
        Monster m4 = new NormalType("Ditto", 15, 5);
        Monster m5 = new NormalType("Eevee", 15, 5);
        Monster m6 = new NormalType("Porygon", 15, 5);
        Monster m7 = new NormalType("Snorlax", 15, 5);
        Monster m8 = new NormalType("Sentret", 15, 5);
        Monster m9 = new NormalType("Dunsparce", 15, 5);
        
        String input = "";
        
        while(!input.equals("exit")){
            System.out.print("What will the trainer do? ");
            input = sc.nextLine();
            Monster selected = null;
            if(input.equals("catch") || input.equals("release")){
                System.out.print("Which monster? ");
                String name = sc.nextLine();
                try {
                    selected = Monster.selectMonster(name);
                } catch (MonsterNotFoundException e) {
                    notfound++;
                    System.out.println(e.getMessage());
                }
            }
            
            switch(input){
                case "catch":
                    try {
                        player.sureCapture(selected);
                    } catch (AlreadyCapturedException e) {
                        alreadycaptured++;
                        System.out.println(e.getMessage());
                    } catch (FullTeamException e) {
                        fullteam++;
                        System.out.println(e.getMessage());
                    }
                    break;
                case "release":
                    try {
                        player.release(selected);
                    } catch (NotInTeamException e) {
                        notinteam++;
                        System.out.println(e.getMessage());
                    }
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
        
        System.out.printf("Encountered errors:%n"
                + "MonsterNotFoundException: %d%n"
                + "AlreadyCapturedException: %d%n"
                + "FullTeamException: %d%n"
                + "NotInTeamException: %d%n", 
                notfound, alreadycaptured, fullteam, notinteam);
    }
    
}
