package exercise07truthlaolaureano;

public class FireType extends Monster{
    public FireType(String name, int hp, int base){
        super(name, "fire", "grass", "water", hp, base);
        atk = (int)(base * 1.3);
        def = (int)(base * 0.7);
    }

    @Override
    public void special(){
        atk += 2;
        hp -= (0.1 * maxHP);
        System.out.println(getName() + " raised its attack!");
    }
}