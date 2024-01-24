package q2project_truthlaolaureano;

public class Monster {
    private String name, kind, description;
    protected int attack, health;
    private boolean isAlive;

    public Monster(String n, String k, String d, int a, int h, boolean alive){
        this.name = n;
        this.kind = k;
        this.description = d;
        this.attack = a;
        this.health = h;
        this.isAlive = alive;
    }

    public void attackPlayer(Player p){
        p.health = p.getHealth() - attack;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public String getDescription() {
        return description;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
}
