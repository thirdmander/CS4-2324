package exercise09truthlaolaureano;
import java.util.ArrayList;

public class Trainer extends Character {
    private Monster activeMonster;
    private ArrayList<Monster> team;

    public Trainer(String n){
        super(n);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }
    public Trainer(String n, Location l){
        super(n, l);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }

    public Monster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<Monster> getTeam(){
        return team;
    }

    public void capture(Monster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(this.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(this.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(Monster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
    public void inspect(Interactive i){
        i.interact();
    }

    public void addTeam(Monster m){
        team.add(m);
        activeMonster = m;
        System.out.println(m.getName() + " joined the party!");
    }

    public void sureCapture(Monster m) throws AlreadyCapturedException, FullTeamException{
        if(team.contains(m)){
            throw new AlreadyCapturedException(m.getName() + " is already in your party!");
        }

        if(team.size() > 6){
            throw new FullTeamException("Your party is already full!");
        }

        team.add(m);
        System.out.printf("%s was successfully captured.%n", m.getName());
    }
    
    public void release(Monster m) throws NotInTeamException{
        if(!team.contains(m)){
            throw new NotInTeamException(m.getName() + " is not in your party!");
        }
        team.remove(m);
        System.out.printf("%s was released from the team.%n", m.getName());
    }
}
