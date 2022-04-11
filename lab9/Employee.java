package me.jordan.lab9;

public class Employee extends Person {
    private String department;

    public Employee(String first, String last, String department) {
        super(first, last);
        this.department = department;
    }

    public void changeDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + " (" + department + ")";
    }
}
