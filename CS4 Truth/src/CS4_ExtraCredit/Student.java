package CS4_ExtraCredit;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Assignment> assignments = new ArrayList<Assignment>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }
    
    public double getTimeNeeded(){
        double totalTimeNeeded = 0.0;
        for (Assignment a : assignments){
            totalTimeNeeded += a.getTimeAlloted();
        }
        return totalTimeNeeded;
    }

    public void finishAssignment(Assignment a){
        assignments.remove(a);
    }
}
