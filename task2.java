class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting.");
    }

    public void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // Overriding methods
    @Override
    public void start() {
        System.out.println("Car engine is starting with " + numberOfSeats + " seats.");
    }

    @Override
    public void stop() {
        System.out.println("Car is parking and turning off the engine.");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car(5);

        // Call overridden methods
        myCar.start();
        myCar.stop();
    }
}
