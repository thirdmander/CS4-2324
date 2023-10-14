package CS4_ExtraCredit;

public class Main {
    public static void main(String[] args){
        Section c1 = new Section("Proton");        
        Section c2 = new Section("Neutron");

        Student s1 = new Student("Juan dela Cruz");
        Student s2 = new Student("Juanita Reyes");
        Student s3 = new Student("Jan Cruz");

        Teacher t1 = new Teacher("Sir John", "English 2");
        Teacher t2 = new Teacher("Sir Watson", "Physics 2");
        Teacher t3 = new Teacher("Maam Jen", "CS 1");
        
        Assignment a1 = new Assignment ("Practical Exam", 2.0);
        Assignment a2 = new Assignment ("Long Test", 3.0);
        Assignment a3 = new Assignment ("Quiz", 5.0);

        //adds the students that belong in each section
        c1.getStudents().add(s1);
        c1.getStudents().add(s2);
        c2.getStudents().add(s3);

        //adds the sections the teachers hold
        t1.getSections().add(c1);
        t1.getSections().add(c2);
        t2.getSections().add(c2);
        t3.getSections().add(c1);

        //the teachers give assignments to each student they hold
        t1.giveAssignment(a1);
        t2.giveAssignment(a2);
        t3.giveAssignment(a3);
        s2.finishAssignment(a1);

        System.out.printf("%s remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());
    }
}
