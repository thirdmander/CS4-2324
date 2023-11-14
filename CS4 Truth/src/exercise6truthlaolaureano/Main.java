package exercise6truthlaolaureano;

public class Main {
    public static void main(String[] args){
        //initialize new monsters with very familiar names
        FireType ft = new FireType("Torchic", 15, 10);
        WaterType wt = new WaterType("Mudkip", 15, 10);
        GrassType gt = new GrassType("Treecko", 15, 10);

        fight(ft, wt);
        fight(ft, gt);
        fight(wt, gt);
    }

    public static void fight(Monster m1, Monster m2){
        //makes each monster attack the other monster as long as the monster is still alive 
        while (m1.getHP() > 0 && m2.getHP() > 0){
            if (m1.getHP() > 0){
                m1.attack(m2);
            }
            if (m2.getHP() > 0){
                m2.attack(m1);
            }
        }
        //restores the monsters health
        m1.hp = m1.maxHP;
        m2.hp = m1.maxHP;
    }
}
