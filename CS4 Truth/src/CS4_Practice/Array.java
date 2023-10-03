package CS4_Practice;
import java.util.ArrayList;

public class Array {

    public static void main(String[] args){
        Person a = new Person("Bob", 23);
        Person b = new Person("Babe", 21);
        ArrayList<Person> people = new ArrayList<Person>(); 

        people.add(a);
        people.add(b);

        System.out.println(Person.getPerson(0).getName());
    }
} 

