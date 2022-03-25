public class Person {

    public final String ID;
    public String firstName;
    public String lastName;

    public Person(String first, String last) {
        this(first, last, first+last);
    }

    public Person(String first, String last, String id) {
        ID = id;
        firstName = first;
        lastName = last;
    }

    public void sayHelloTo(String name) {
        System.out.println("Hey " + name + "! My name is " + firstName + ".");
    }

    public void sayHelloTo(Person person) {
        sayHelloTo(person.firstName);
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + " (" + ID + ")";
    }
}
