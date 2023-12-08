package q2sa1truthlaolaureanopart1;
public class Adventurer {
    protected String name;
    protected Quest currentQuest;
    protected int rank;
    protected double earnings;
    
    public Adventurer(String n, int r){
        name = n;
        rank = r;
        earnings = 0;
    }
    public String getName() {
        return name;
    }
    public int getRank() {
        return rank;
    }
    public double getEarnings() {
        return earnings;
    }

    public void takeQuest(Quest q){
        if(q.isAvailable() && q.getDifficulty() <= rank){
            q.assigned();
            currentQuest = q;
        }
    }
    public void abandonQuest(){
        if(currentQuest != null){
            currentQuest.abandoned();
            currentQuest = null;
        }
    }
    public void completeQuest(){
        if(currentQuest != null){
            currentQuest.completed();
            earnings += currentQuest.getReward();
            currentQuest = null;
        }
    }
}
