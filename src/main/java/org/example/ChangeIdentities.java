package org.example;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age;
    }
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempName = p1.getName();
        int tempAge = p1.getAge();
        p1.setName(p2.getName());
        p1.setAge(p2.getAge());
        p2.setName(tempName);
        p2.setAge(tempAge);
    }
}
public class ChangeIdentities {
    public static void main(String[] args) {
        Person p1 = new Person("Mark", 31);
        Person p2 = new Person("Andrew", 22);

        System.out.println("p1 = " + p1.toString());
        System.out.println("p2 = " + p2.toString());

        MakingChanges.changeIdentities(p1, p2);

        System.out.println("p1 = " + p1.toString());
        System.out.println("p2 = " + p2.toString());
    }
}
