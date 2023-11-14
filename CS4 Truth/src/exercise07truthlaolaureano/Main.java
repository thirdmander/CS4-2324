package exercise07truthlaolaureano;

public class Main {
    public static void main(String[] args){
        //initialize variables
        Monster ft = new FireType("Torchic", 15, 10);
        Trainer red = new Trainer("Red");
        Location town = new Location("Littleroot Town", "A new beginning, the professor's lab is located here.");
        NPC npc = new NPC("Mom", "You look tired, you should take a rest.");

        red.inspect(npc);
        red.inspect(ft);
        red.inspect(town);
    }
}
