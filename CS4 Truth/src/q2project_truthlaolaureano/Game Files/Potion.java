package q2project_truthlaolaureano;

public class Potion extends Item{
    protected int healthGained, attackGained = 0;

    public Potion(String n, String d , int h, int a) {
        super(n, d);
        this.healthGained = h;
        this.attackGained = a;
    }

}
