import java.util.Scanner;


public class Q41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Two Wheeler:");
        System.out.print("Color: ");
        String colorTwoWheeler = scanner.nextLine();
        System.out.print("Number: ");
        String numberTwoWheeler = scanner.nextLine();
        System.out.print("Fuel Consumption (km/l): ");
        double consumptionTwoWheeler = scanner.nextDouble();

        TwoWheeler twoWheeler = new TwoWheeler(colorTwoWheeler, numberTwoWheeler, consumptionTwoWheeler);

        System.out.println("\nEnter details for Four Wheeler:");
        System.out.print("Color: ");
        scanner.nextLine(); // Consume newline left-over
        String colorFourWheeler = scanner.nextLine();
        System.out.print("Number: ");
        String numberFourWheeler = scanner.nextLine();
        System.out.print("Fuel Consumption (km/l): ");
        double consumptionFourWheeler = scanner.nextDouble();

        FourWheeler fourWheeler = new FourWheeler(colorFourWheeler, numberFourWheeler, consumptionFourWheeler);

        System.out.println("\nEnter distance traveled (in km):");
        double distance = scanner.nextDouble();

        System.out.println("\nDetails for Two Wheeler:");
        System.out.println("Color: " + twoWheeler.getColor());
        System.out.println("Number: " + twoWheeler.getNumber());
        System.out.println("Fuel Consumption: " + twoWheeler.getConsumption() + " km/l");
        System.out.println("Fuel Consumed: " + twoWheeler.calculateFuelConsumed(distance) + " liters");

        System.out.println("\nDetails for Four Wheeler:");
        System.out.println("Color: " + fourWheeler.getColor());
        System.out.println("Number: " + fourWheeler.getNumber());
        System.out.println("Fuel Consumption: " + fourWheeler.getConsumption() + " km/l");
        System.out.println("Fuel Consumed: " + fourWheeler.calculateFuelConsumed(distance) + " liters");

        scanner.close();
    }
}


interface Vehicle {
    String getColor();
    String getNumber();
    double getConsumption();
}

class TwoWheeler implements Vehicle {
    private String color;
    private String number;
    private double consumption;

    public TwoWheeler(String color, String number, double consumption) {
        this.color = color;
        this.number = number;
        this.consumption = consumption;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public double getConsumption() {
        return consumption;
    }

    public double calculateFuelConsumed(double distance) {
        return distance / consumption;
    }
}

class FourWheeler implements Vehicle {
    private String color;
    private String number;
    private double consumption;

    public FourWheeler(String color, String number, double consumption) {
        this.color = color;
        this.number = number;
        this.consumption = consumption;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public double getConsumption() {
        return consumption;
    }

    public double calculateFuelConsumed(double distance) {
        return distance / consumption;
    }
}
