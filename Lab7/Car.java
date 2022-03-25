public class Car {

    public String make;
    public String model;
    public int year;
    public Person owner;
    public long odometer;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        odometer = 0;
    }

    public long drive(long distance) {
        System.out.println("Vroom vroom");
        odometer += distance;
        return odometer;
    }

    @Override
    public String toString() {
        return "Car: " + year + " " + make + " " + model;
    }
}
