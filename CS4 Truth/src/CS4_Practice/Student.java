package CS4_Practice;

public class Student extends Person{
    private double grade;
    private int yearLevel;
    private String section;

    public Student(String name, int age, double grade, int yearLevel, String section){
        super(name, age, 0);
        this.grade = grade;
        this.yearLevel = yearLevel;
        this.section = section;
    }

    public double getGrade() {
        return grade;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public String getSection() {
        return section;
    }

    public static void main(String[] args){
        Student emman = new Student("Emman", 16, 97.6, 10, "Graviton");
        emman.earnMoney(150);
        System.out.println(emman.getWallet());
    }
}
