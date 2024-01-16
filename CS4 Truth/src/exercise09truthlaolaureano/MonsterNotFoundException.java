package exercise09truthlaolaureano;

public class MonsterNotFoundException extends Exception {
    public MonsterNotFoundException(String msg){
        super(msg + " is not a valid monster");
    }
}
