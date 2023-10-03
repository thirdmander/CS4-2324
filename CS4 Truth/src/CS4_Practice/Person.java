package CS4_Practice;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private Person friend;
    private static ArrayList<Person> persons = new ArrayList<Person>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        persons.add(this);
    }

    public void makeFriend(Person newFriend) {
        this.friend = newFriend;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public Person getFriend(){
        return friend;
    }

    public static Person getPerson(int index){
        return persons.get(index);
    }

    public static Person getPerson(String name){
        for(Person p : persons){
            if(p.name.equals(name)){
                return p;
            }
        } 
        return null;
    }
    public static void main(String[] args){
        Person nathan = new Person("Nathan", 21);
        Person dan = new Person("Daniel", 21);

        nathan.makeFriend(dan);

        System.out.println(nathan.friend.name);
    }
}
