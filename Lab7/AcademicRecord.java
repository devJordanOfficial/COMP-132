public class AcademicRecord {

    public Person student;
    public String major;
    public short year;
    public double[] grades;

    public AcademicRecord(Person student) {
        this.student = student;
        major = "undeclared";
        year = 1;
        grades = new double[10];
    }

    public long calculateAverage() {
        long average = 0;
        for (double grade : grades) {
            average += grade;
        }
        average = average / grades.length;
        return Math.round(average);
    }

    public String calculateLetterGrade() {
        long grade = calculateAverage();

        if (grade >= 90 && grade <= 100) return "A+";
        if (grade >= 85 && grade <= 89) return "A";
        if (grade >= 80 && grade <= 84) return "A-";
        if (grade >= 77 && grade <= 79) return "B+";
        if (grade >= 73 && grade <= 76) return "B";
        if (grade >= 70 && grade <= 72) return "B-";
        if (grade >= 65 && grade <= 69) return "C+";
        if (grade >= 60 && grade <= 64) return "C";
        if (grade >= 50 && grade <= 59) return "D";
        if (grade >= 0 && grade <= 49) return "F";

        System.out.println("Error: Invalid grade! Must be between 0 and 100");
        return null;
    }

    @Override
    public String toString() {
        return "AcademicRecord: " + student.ID + " " + major + " " + calculateLetterGrade();
    }
}
