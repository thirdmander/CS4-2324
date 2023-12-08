package q2sa1truthlaolaureanopart2;

public class Phone extends Computer{
    private int storage, phoneNumber; //storage in bytes

    public Phone (int r, int p, int t, int s, int pn){
        super(r, p, t);
        storage = s;
        phoneNumber = pn;
    }
    
    public int getStorage() {
        return storage;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void calculate(){
        storage++;
        totalCalcs++;
    }
}
