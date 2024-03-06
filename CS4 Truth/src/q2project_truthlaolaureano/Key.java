public class Key extends Item{
    protected Room unlocksRoom;
    
    public Key(String n, String d, Room r) {
        super(n, d);
        this.unlocksRoom = r;
    }
}
