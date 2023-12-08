package q2sa1truthlaolaureanopart1;
public class BountyHuntingQuest extends Quest{
    private String target;
    private boolean available, completed;
    
    public BountyHuntingQuest(String n, int d, double r){
        super(n,d,r);
        if(difficulty < 1 ) difficulty = 5;
        if(difficulty > 10 ) difficulty = 10;
        available = true;
    }

    public String getTarget(){
        return target;
    }

    @Override
    public boolean isAvailable(){
        if(available && !completed) return true;
        else return false;
    }

    @Override
    public void assigned(){
        available = false;
    }

    @Override
    public void abandoned(){
        available = true;
    }

    @Override
    public void completed(){
        completed = true;
    }
}
