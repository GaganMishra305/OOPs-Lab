import java.util.Scanner;


public class Q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance traveled (in km) by bus:");
        double distanceBus = scanner.nextDouble();
        System.out.println("Enter fare per km for bus:");
        double farePerKmBus = scanner.nextDouble();

        Fare bus = new Bus(distanceBus, farePerKmBus);

        System.out.println("Enter distance traveled (in km) by train:");
        double distanceTrain = scanner.nextDouble();
        System.out.println("Enter fare per km for train:");
        double farePerKmTrain = scanner.nextDouble();

        Fare train = new Train(distanceTrain, farePerKmTrain);

        System.out.println("\nFare for Bus: $" + bus.getAmount());
        System.out.println("Fare for Train: $" + train.getAmount());

        scanner.close();
    }
}


interface Fare {
    double getAmount();
}

class Bus implements Fare {
    private double distance;
    private double farePerKm;

    public Bus(double distance, double farePerKm) {
        this.distance = distance;
        this.farePerKm = farePerKm;
    }

    @Override
    public double getAmount() {
        return distance * farePerKm;
    }
}

class Train implements Fare {
    private double distance;
    private double farePerKm;

    public Train(double distance, double farePerKm) {
        this.distance = distance;
        this.farePerKm = farePerKm;
    }

    @Override
    public double getAmount() {
        return distance * farePerKm;
    }
}
