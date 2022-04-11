package me.jordan.lab9;

public class GraduateStudent extends Student {
    public GraduateStudent(String first, String last, String id) {
        super(first, last, id);
    }

    @Override
    public String toString() {
        return "GraduateStudent: " + firstName + " " + lastName + " (" + ID + ", likes school: " + likesSchool + ")";
    }
}
