package exercise07truthlaolaureano;

public class WaterType extends Monster{
    public WaterType(String name, int hp, int base){
        super(name, "water", "fire", "grass", hp, base);
        atk = (int)(base * 0.7);
        def = (int)(base * 1.3);
    }

    @Override
    public void special(){
        def += 2;
        hp -= (0.1 * maxHP);
        System.out.println(getName() + " raised its defense!");
    }
}
