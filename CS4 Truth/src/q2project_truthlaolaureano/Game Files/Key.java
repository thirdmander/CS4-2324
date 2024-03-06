public class Key<Room> extends Item{
    protected Room unlocksRoom;
    
    public Key(String n, String d, Room r) {
        super(n, d);
        this.unlocksRoom = r;
    }
}
