import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter item description for Invoice:");
        String description = scanner.nextLine();
        System.out.println("Enter quantity for Invoice:");
        int quantity = scanner.nextInt();
        System.out.println("Enter price per item for Invoice:");
        double pricePerItem = scanner.nextDouble();
        Invoice invoice = new Invoice(description, quantity, pricePerItem);
        invoice.getAmount();

        System.out.println("Enter the hourly rate for HourlyEmployee:");
        double hourlyRate = scanner.nextDouble();
        System.out.println("Enter the total hours worked for HourlyEmployee:");
        int totalHours = scanner.nextInt();
        HourlyEmployee hourlyEmployee = new HourlyEmployee(hourlyRate, totalHours);
        hourlyEmployee.getAmount();

        scanner.close();
    }
}

interface Payable {
    void getAmount();
}

class Invoice implements Payable {
    private String description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String description, int quantity, double pricePerItem) {
        this.description = description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public void getAmount() {
        double amount = quantity * pricePerItem;
        System.out.println("Invoice Amount for " + description + ": $" + amount);
    }
}

class HourlyEmployee implements Payable {
    private double hourlyRate;
    private int totalHours;

    public HourlyEmployee(double hourlyRate, int totalHours) {
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }

    @Override
    public void getAmount() {
        double amount = hourlyRate * totalHours;
        System.out.println("Hourly Employee Amount: $" + amount);
    }
}
