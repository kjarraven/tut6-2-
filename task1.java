class Transport {
    public void ignite() {
        System.out.println("Transport is now active.");
    }

    public void shutdown() {
        System.out.println("Transport is now inactive.");
    }
}

class Bus extends Transport {
    private int seatCapacity;

    public Bus(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }
}

public class TaskOne {
    public static void main(String[] args) {
        Bus cityBus = new Bus(40);
        cityBus.ignite();
        cityBus.shutdown();
        System.out.println("Seat Capacity: " + cityBus.getSeatCapacity());
    }
}
