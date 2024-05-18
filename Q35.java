import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Hostler Student:");
        System.out.print("First Name: ");
        String firstNameHostler = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastNameHostler = scanner.nextLine();
        System.out.print("Address: ");
        String addressHostler = scanner.nextLine();
        System.out.print("Contact: ");
        String contactHostler = scanner.nextLine();
        System.out.print("Hostel Fee: ");
        double hostelFee = scanner.nextDouble();
        System.out.print("Tuition Fee: ");
        double tuitionFeeHostler = scanner.nextDouble();

        StudentFee hostler = new Hostler(firstNameHostler, lastNameHostler, addressHostler, contactHostler, hostelFee, tuitionFeeHostler);

        scanner.nextLine(); // Consume newline left-over

        System.out.println("\nEnter details for Non-Hostler Student:");
        System.out.print("First Name: ");
        String firstNameNonHostler = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastNameNonHostler = scanner.nextLine();
        System.out.print("Address: ");
        String addressNonHostler = scanner.nextLine();
        System.out.print("Contact: ");
        String contactNonHostler = scanner.nextLine();
        System.out.print("Tuition Fee: ");
        double tuitionFeeNonHostler = scanner.nextDouble();

        StudentFee nonHostler = new NonHostler(firstNameNonHostler, lastNameNonHostler, addressNonHostler, contactNonHostler, tuitionFeeNonHostler);

        System.out.println("\nDetails for Hostler Student:");
        System.out.println("Name: " + hostler.getFirstName() + " " + hostler.getLastName());
        System.out.println("Address: " + hostler.getAddress());
        System.out.println("Contact: " + hostler.getContact());
        System.out.println("Total Fee: $" + hostler.getAmount());

        System.out.println("\nDetails for Non-Hostler Student:");
        System.out.println("Name: " + nonHostler.getFirstName() + " " + nonHostler.getLastName());
        System.out.println("Address: " + nonHostler.getAddress());
        System.out.println("Contact: " + nonHostler.getContact());
        System.out.println("Total Fee: $" + nonHostler.getAmount());

        scanner.close();
    }
}


interface StudentFee {
    double getAmount();
    String getFirstName();
    String getLastName();
    String getAddress();
    String getContact();
}

class Hostler implements StudentFee {
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private double hostelFee;
    private double tuitionFee;

    public Hostler(String firstName, String lastName, String address, String contact, double hostelFee, double tuitionFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.hostelFee = hostelFee;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public double getAmount() {
        return hostelFee + tuitionFee;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getContact() {
        return contact;
    }
}

class NonHostler implements StudentFee {
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private double tuitionFee;

    public NonHostler(String firstName, String lastName, String address, String contact, double tuitionFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public double getAmount() {
        return tuitionFee;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getContact() {
        return contact;
    }
}

