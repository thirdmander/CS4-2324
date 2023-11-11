package exercise6truthlaolaureano;

public class Main {
    public static void main(String[] args){
        //initialize new monsters with very familiar names
        FireType ft = new FireType("Torchic", 15, 8);
        WaterType wt = new WaterType("Mudkip", 15, 8);
        GrassType gt = new GrassType("Treecko", 15, 8);

        fight(ft, wt);
        fight(ft, gt);
        fight(wt, gt);
    }

    public static void fight(Monster m1, Monster m2){
        while (m1.getHP() > 0 && m2.getHP() > 0){
            if (m1.getHP() > 0){
                m1.attack(m2);
            }
            if (m2.getHP() > 0){
                m2.attack(m1);
            }
        }
        m1.hp = m1.maxHP;
        m2.hp = m1.maxHP;
    }
}
