public class Weapon extends Item {
    protected int attackAdded = 0;

    public Weapon(String n, String d, int a) {
        super(n, d);
        this.attackAdded = a;
    }
}
