package me.jordan.lab9;

public class Student extends Person {
    private static int highestNum;

    public boolean likesSchool;
    private String major;

    public Student(String first, String last, String id) {
        super(first, last, String.format("C%o7", highestNum));
    }

    @Override
    public void sayHelloTo(String name) {
        System.out.println("Hey " + name + "! My name is " + firstName + ", my major is " + major + ".");
    }

    @Override
    public void sayHelloTo(Person person) {
        sayHelloTo(person.firstName);
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + " (" + ID + ", likes school: " + likesSchool + ")";
    }


}
