package CS4_ExtraCredit;

public class Assignment {
    private String name;
    private double timeAlloted;

    public Assignment(String name, double timeAlloted){
        this.name = name;
        this.timeAlloted = timeAlloted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTimeAlloted() {
        return timeAlloted;
    }

    public void setTimeAlloted(double timeAlloted) {
        this.timeAlloted = timeAlloted;
    }
     
}
