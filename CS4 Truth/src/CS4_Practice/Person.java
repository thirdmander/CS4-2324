package CS4_Practice;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private Person friend;
    private int wallet;
    private static ArrayList<Person> persons = new ArrayList<Person>();

    public Person(String name, int age, int wallet) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;
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
    public int getWallet() {
        return wallet; 
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
    public int earnMoney(int moneyGained){
        return wallet += moneyGained;
    }
    public static void main(String[] args){
        Person nathan = new Person("Nathan", 21, 100);
        Person dan = new Person("Daniel", 21, 150);

        nathan.makeFriend(dan);

        System.out.println(nathan.friend.name);
    }
}
