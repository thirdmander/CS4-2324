package q2project_truthlaolaureano;

public abstract class Item {
    protected String name, description;

    public Item(String n, String d){
        this.name = n;
        this.description = d;
    }

    public abstract void use();
}
