package q2sa1truthlaolaureanopart1;
public class GatheringQuest extends Quest implements Renewable{
    private String itemName;
    private int quota, currentGathered, adventurerCount;
    
    public GatheringQuest(String n, double r, String i, int q){
        super(n, 1, r);
        itemName = i;
        quota = q;
        currentGathered = 0;
        adventurerCount = 0;
    }

    public String getItemName() {
        return itemName;
    }

    public int getAdventurerCount() {
        return adventurerCount;
    }

    @Override
    public boolean isAvailable() {
        if(currentGathered < quota) return true;
        else return false;
    }

    @Override
    public void assigned(){
        adventurerCount++;
    }

    @Override
    public void abandoned(){
        adventurerCount--;
    }

    @Override
    public void completed(){
        adventurerCount--;
        currentGathered++;
    }

    @Override
    public void renew(){
        currentGathered = 0;
    }
}
