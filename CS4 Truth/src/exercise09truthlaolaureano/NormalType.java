package exercise09truthlaolaureano;

public class NormalType extends Monster {
    public NormalType(String name, int hp, int base) {
        super(name, "normal", "none", "none", hp, base);
    }

    @Override
    public void special(){
        atk += 2;
        def += 2;
        hp -= 4;
    }
}
