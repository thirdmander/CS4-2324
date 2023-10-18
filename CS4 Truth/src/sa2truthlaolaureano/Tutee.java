package sa2truthlaolaureano;

public class Tutee{
	private String name, subject;
	private double money, grade;
	private static int totalTutorialSessions = 0;
	
	public Tutee(String n, double m){
		name = n;
		money = m;
		subject = "Math";
		grade = 60;
	}
	public Tutee(String n, double m, String s, double g){
		name = n;
		money = m;
		subject = s;
		grade = g;
	}
	
	public String getName(){
		return name;
	}
	public String getSubject(){
		return subject;
	}
	public double getMoney(){
		return money;
	}
	public double getGrade(){
		return grade;
	}
	public static int getTotalTutorialSessions(){
		return totalTutorialSessions;
	}
	public void consult(Tutor t){
		if(money >= t.getRate()){
			money -= t.getRate();
			t.addEarnings(t.getRate());
			totalTutorialSessions += 1;
			if(subject == t.getSpecialization()){
				System.out.printf("%s helped %s make great progress in %s. %n", t.getName(), name, subject);
				grade += 3;
			}
			else{
				System.out.printf("%s helped %s a little. %n", t.getName(), name);
				grade += 1;
			}
		}
		else{
			System.out.println(name + " doesn't have enough money to have a consultation with " + t.getName() + ".");
		}
	}
}