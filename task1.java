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
}

public class task1 {
    public static void main(String[] args) {

        Car myCar = new Car(5);
        myCar.start();
        myCar.stop();

        System.out.println("Number of seats: " + myCar.getNumberOfSeats());
    }
}
