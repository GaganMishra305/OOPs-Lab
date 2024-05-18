import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter department for Contract Employee:");
        String contractDept = scanner.nextLine();
        System.out.println("Enter designation for Contract Employee:");
        String contractDesig = scanner.nextLine();

        System.out.println("Enter department for Regular Employee:");
        String regularDept = scanner.nextLine();
        System.out.println("Enter designation for Regular Employee:");
        String regularDesig = scanner.nextLine();

        ContractEmployee contractEmployee = new ContractEmployee(firstName, lastName, contractDept, contractDesig);
        RegularEmployee regularEmployee = new RegularEmployee(firstName, lastName, regularDept, regularDesig);

        System.out.println("Contract Employee Full Name: " + contractEmployee.displayFullName());
        System.out.println("Contract Employee Department: " + contractEmployee.getDepartment());
        System.out.println("Contract Employee Designation: " + contractEmployee.getDesig());

        System.out.println("Regular Employee Full Name: " + regularEmployee.displayFullName());
        System.out.println("Regular Employee Department: " + regularEmployee.getDepartment());
        System.out.println("Regular Employee Designation: " + regularEmployee.getDesig());

        scanner.close();
    }
}

class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class ContractEmployee extends Employee {
    private String department;
    private String designation;

    public ContractEmployee(String firstName, String lastName, String department, String designation) {
        super(firstName, lastName);
        this.department = department;
        this.designation = designation;
    }

    public String displayFullName() {
        return getFirstName() + " " + getLastName();
    }

    public String getDepartment() {
        return department;
    }

    public String getDesig() {
        return designation;
    }
}

class RegularEmployee extends Employee {
    private String department;
    private String designation;

    public RegularEmployee(String firstName, String lastName, String department, String designation) {
        super(firstName, lastName);
        this.department = department;
        this.designation = designation;
    }

    public String displayFullName() {
        return getFirstName() + " " + getLastName();
    }

    public String getDepartment() {
        return department;
    }

    public String getDesig() {
        return designation;
    }
}
