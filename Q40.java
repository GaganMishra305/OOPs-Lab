import java.util.Scanner;


public class Q40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Hourly Employee:");
        System.out.print("Name: ");
        String nameHourly = scanner.nextLine();
        System.out.print("Employee ID: ");
        int idHourly = scanner.nextInt();
        System.out.print("Number of hours worked per week: ");
        int hours = scanner.nextInt();
        System.out.print("Wages per hour: ");
        double wagesPerHour = scanner.nextDouble();

        HourlyEmployee hourlyEmployee = new HourlyEmployee(nameHourly, idHourly, hours, wagesPerHour);

        System.out.println("\nEnter details for Weekly Employee:");
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Name: ");
        String nameWeekly = scanner.nextLine();
        System.out.print("Employee ID: ");
        int idWeekly = scanner.nextInt();
        System.out.print("Number of weeks worked: ");
        int weeks = scanner.nextInt();
        System.out.print("Wages per week: ");
        double wagesPerWeek = scanner.nextDouble();

        WeeklyEmployee weeklyEmployee = new WeeklyEmployee(nameWeekly, idWeekly, weeks, wagesPerWeek);

        System.out.println("\nEmployee Details:");
        System.out.println(hourlyEmployee.name + " (" + hourlyEmployee.getDesig() + ")");
        hourlyEmployee.calculateWages();
        System.out.println();
        System.out.println(weeklyEmployee.name + " (" + weeklyEmployee.getDesig() + ")");
        weeklyEmployee.calculateWages();

        scanner.close();
    }
}


class ContractEmployee {
    String name;
    int empId;

    ContractEmployee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    String getDesig() {
        return "Contract Employee";
    }

    void calculateWages() {
        System.out.println("Monthly salary of " + name + " (ID: " + empId + "): ");
    }
}

class HourlyEmployee extends ContractEmployee {
    int hours;
    double wagesPerHour;

    HourlyEmployee(String name, int empId, int hours, double wagesPerHour) {
        super(name, empId);
        this.hours = hours;
        this.wagesPerHour = wagesPerHour;
    }

    @Override
    String getDesig() {
        return "Hourly Employee";
    }

    @Override
    void calculateWages() {
        super.calculateWages();
        double monthlySalary = hours * wagesPerHour * 4; // Assuming 4 weeks in a month
        System.out.println("$" + monthlySalary);
    }
}

class WeeklyEmployee extends ContractEmployee {
    int weeks;
    double wagesPerWeek;

    WeeklyEmployee(String name, int empId, int weeks, double wagesPerWeek) {
        super(name, empId);
        this.weeks = weeks;
        this.wagesPerWeek = wagesPerWeek;
    }

    @Override
    String getDesig() {
        return "Weekly Employee";
    }

    @Override
    void calculateWages() {
        super.calculateWages();
        double monthlySalary = weeks * wagesPerWeek;
        System.out.println("$" + monthlySalary);
    }
}
