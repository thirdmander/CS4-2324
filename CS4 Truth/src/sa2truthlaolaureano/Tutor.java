package sa2truthlaolaureano;

public class Tutor {
    private String name, specialization;
    private double rate, earnings;

    public Tutor(String n, double r, String spec){
        name = n;
        specialization = spec;
        rate = r;
        earnings = 0;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getRate() {
        return rate;
    }

    public double getEarnings() {
        return earnings;
    }

    public void addEarnings(double rate){
        earnings += rate;
    }
}
