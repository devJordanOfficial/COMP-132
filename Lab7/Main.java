public class Main {

    public static void main(String[] args) {
//        testAcademicRecord();
//        testCar();
//        testPerson();
//        testPoint();
    }

    private static void testAcademicRecord() {
        Person person = new Person("Jordan", "Devuyst", "C0512737");
        AcademicRecord record = new AcademicRecord(person);

        System.out.println("Test --"); // SUCCESS
        System.out.println("Result: " + record.calculateAverage());
        System.out.println("Expected: 0");
        System.out.println("\n");

        System.out.println("Test --"); // SUCCESS
        System.out.println("Result: " + record.calculateLetterGrade());
        System.out.println("Expected: F");
        System.out.println("\n");

        System.out.println("Test --"); // SUCCESS
        System.out.println("Result: " + record.major);
        System.out.println("Expected: undeclared");
        System.out.println("\n");

        System.out.println("Test --"); // SUCCESS
        System.out.println("Result: " + record.toString());
        System.out.println("Expected: AcademicRecord: C0512737 undeclared F");
        System.out.println("\n");
    }

    private static void testCar() {
        Car honda = new Car("Honda", "Accord", 2009);

        System.out.println("Test --"); // SUCCESS
        System.out.println("Result: " + honda.toString());
        System.out.println("Expected: Car: 2009 Honda Accord");
        System.out.println("\n");

        System.out.println("Test --"); // SUCCESS
        System.out.println(honda.drive(1200)); // Expected odometer 1200
        System.out.println("\n");

        System.out.println("Test --");
        System.out.println(honda.drive(5312)); // Expected odometer 6512
        System.out.println("\n");
    }

    private static void testPerson() {
        Person person = new Person("Jane", "Doe");
        Person person2 = new Person("Jordan", "Devuyst", "C0512737");

        System.out.println("Test --"); // SUCCESS
        System.out.print("Result: ");
        person.sayHelloTo("John");
        System.out.print("Expected: " + "Hey John! My name is Jane.");
        System.out.println("\n");

        System.out.println("Test --"); // SUCCESS
        System.out.print("Result: ");
        person.sayHelloTo(person2);
        System.out.println("Expected: Hey Jordan! My name is Jane.");
        System.out.println("\n");

        System.out.println("Test --"); // SUCCESS
        System.out.println("Result: " + person.toString());
        System.out.println("Expected: Person: Jane Doe (JaneDoe)");
        System.out.println("\n");

        System.out.println("Test --"); // SUCCESS
        System.out.println("Result: " + person2.toString());
        System.out.println("Expected: Person: Jordan Devuyst (C0512737)");
        System.out.println("\n");
    }

    private static void testPoint() {
        Point point = new Point(); // SUCCESS
        Point point2 = new Point(6,6); // SUCCESS

        System.out.println("Test --"); // SUCCESS
        System.out.println("Result: " + point.distanceFrom(4,4));
        System.out.println("Expected: " + 5.656854);
        System.out.println("\n");

        System.out.println("Test --"); // SUCCESS
        System.out.println("Result: " + point2.toString());
        System.out.println("Expected: Point [6.0, 6.0]");
        System.out.println("\n");

        System.out.println("Test --"); // SUCCESS
        System.out.println("Result: " + point.distanceFrom(point2)); // SUCCESS
        System.out.println("Expected: 8.485281");
    }
}
