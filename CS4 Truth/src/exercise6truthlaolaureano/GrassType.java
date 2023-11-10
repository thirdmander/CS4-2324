package exercise6truthlaolaureano;

public class GrassType extends Monster{
    public GrassType(String name, int hp, int base){
        super(name, "grass", "water", "fire", hp, base);
    }

    @Override
    public void special(){
        hp += maxHP * 0.2;
        if(hp > maxHP) hp = maxHP;
        System.out.println(getName() + " raised its attack!");
    }

    @Override
    public void rest(){
        hp += maxHP * 0.5;
        if(hp > maxHP) hp = maxHP;
        System.out.println(getName() + " rested. It's health is now " + hp + ".");
    }
}
