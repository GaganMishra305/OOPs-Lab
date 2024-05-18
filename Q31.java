import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the hourly rate for HourlyEmployee:");
        double hourlyRate = scanner.nextDouble();
        System.out.println("Enter the total hours worked for HourlyEmployee:");
        int totalHours = scanner.nextInt();
        HourlyEmployee hourlyEmployee = new HourlyEmployee(hourlyRate, totalHours);
        hourlyEmployee.getAmount();

        System.out.println("Enter the weekly rate for WeeklyEmployee:");
        double weeklyRate = scanner.nextDouble();
        System.out.println("Enter the total weeks worked for WeeklyEmployee:");
        int totalWeeks = scanner.nextInt();
        WeeklyEmployee weeklyEmployee = new WeeklyEmployee(weeklyRate, totalWeeks);
        weeklyEmployee.getAmount();

        scanner.close();
    }
}

abstract class Employee {
    abstract void getAmount();
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int totalHours;

    public HourlyEmployee(double hourlyRate, int totalHours) {
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }

    @Override
    void getAmount() {
        double amount = hourlyRate * totalHours;
        System.out.println("Hourly Employee Amount: $" + amount);
    }
}

class WeeklyEmployee extends Employee {
    private double weeklyRate;
    private int totalWeeks;

    public WeeklyEmployee(double weeklyRate, int totalWeeks) {
        this.weeklyRate = weeklyRate;
        this.totalWeeks = totalWeeks;
    }

    @Override
    void getAmount() {
        double amount = weeklyRate * totalWeeks;
        System.out.println("Weekly Employee Amount: $" + amount);
    }
}
