package q2sa1truthlaolaureanopart1;
public abstract class Quest {
    protected String name;
    protected int difficulty;
    protected double reward;
    
    public Quest(String n, int d, double r){
        name = n;
        difficulty = d;
        if(difficulty < 1 ) difficulty = 1;
        if(difficulty > 10 ) difficulty = 10;
        reward = r;
    }
    public String getName() {
        return name;
    }
    public int getDifficulty() {
        return difficulty;
    }
    public double getReward() {
        return reward;
    }

    //abstract methods
    public abstract boolean isAvailable(); 
    public abstract void assigned();
    public abstract void abandoned();
    public abstract void completed();
}
