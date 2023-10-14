package CS4_ExtraCredit;
import java.util.ArrayList;

public class Section {
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();
    
    public Section(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
    public void addStudent(Student s) {
        students.add(s);
    }
}
