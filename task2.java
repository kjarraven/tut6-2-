class Vehicle1 {
    public void start() {
        System.out.println("Vehicle is starting.");
    }

    public void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

class Car1 extends Vehicle1 {
    private int numberOfSeats;

    public Car1(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Car engine is starting. Fasten your seatbelt.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping. Apply brakes gently.");
    }
}

public class task2 {
    public static void main(String[] args) {
        Car1 myCar = new Car1(5);
        myCar.start();
        myCar.stop();
        System.out.println("Number of seats: " + myCar.getNumberOfSeats());
    }
}
