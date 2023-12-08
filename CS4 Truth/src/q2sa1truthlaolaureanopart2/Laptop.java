package q2sa1truthlaolaureanopart2;

public class Laptop extends Computer implements InternetCapable{
    private String graphicsDriver, operatingSoftware, wifiNetwork;
    
    public Laptop(int r, int p, int t, String g, String os, String w) {
        super(r, p, t);
        graphicsDriver = g;
        operatingSoftware = os;
        wifiNetwork = w;
    }

    public String getGraphicsDriver() {
        return graphicsDriver;
    }

    public String getOperatingSoftware() {
        return operatingSoftware;
    }

    public String getWifiNetwork() {
        return wifiNetwork;
    }
    
    @Override
    public void calculate(){
        if(operatingSoftware.equals("Windows")){
            System.out.println("This laptop is running on Windows");
        }

        if(processingSpeed > 4){
            totalCalcs += 5;
        } else totalCalcs++;

    }

    @Override
    public void connect(String s) {
        wifiNetwork = s; 
    }
}
