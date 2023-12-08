package q2sa1truthlaolaureanopart1;
public class Novice extends Adventurer implements Renewable {
    private int questCount;
    
    public Novice(String n){
        super(n, 1);
        questCount = 0;
    }
    
    @Override
    public void takeQuest(Quest q){
        if(questCount <= 10){
            if(q.isAvailable() && q.getDifficulty() <= rank){
            q.assigned();
            currentQuest = q;
            }   
        } else {
            System.out.println("You have already taken 10 quests. Please renew your license.");
        }
    }

    @Override
    public void renew(){
        questCount = 0;
        earnings -= 30;
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

    public int getQuestCount() {
        return questCount;
    }
}
