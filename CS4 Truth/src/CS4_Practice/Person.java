package CS4_Practice;

public class Person {
    private String name;
    private int age;
    private Person friend;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    public static void main(String[] args){
        Person nathan = new Person("Nathan", 21);
        Person dan = new Person("Daniel", 21);

        nathan.makeFriend(dan);

        System.out.println(nathan.friend.name);
    }
}
