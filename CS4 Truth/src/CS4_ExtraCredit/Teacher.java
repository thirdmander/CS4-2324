package CS4_ExtraCredit;
import java.util.ArrayList;

public class Teacher {
    private String name;
    private String subject;
    private ArrayList<Section> sections = new ArrayList<Section>();
    
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    public void giveAssignment(Assignment a){
        for (Section section : this.sections){
            for (Student s : section.getStudents()){
                s.getAssignments().add(a);
            }
        }
    }
}
