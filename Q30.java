import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's name:");
        String name = scanner.nextLine();
        System.out.println("Enter student's roll number:");
        int rollNumber = scanner.nextInt();
        System.out.println("Enter student's sports grade:");
        int sGrade = scanner.nextInt();
        System.out.println("Enter student's exam grade:");
        int eGrade = scanner.nextInt();

        Results result = new Results(name, rollNumber, sGrade, eGrade);
        result.calculateFinalResult();
        result.display();

        scanner.close();
    }
}

class Student {
    protected String name;
    protected int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

class Sports extends Student {
    protected int sGrade;

    public Sports(String name, int rollNumber, int sGrade) {
        super(name, rollNumber);
        this.sGrade = sGrade;
    }
}

class Exam extends Student {
    protected int eGrade;

    public Exam(String name, int rollNumber, int eGrade) {
        super(name, rollNumber);
        this.eGrade = eGrade;
    }
}

class Results extends Sports {
    private int eGrade;
    private String finalResult;

    public Results(String name, int rollNumber, int sGrade, int eGrade) {
        super(name, rollNumber, sGrade);
        this.eGrade = eGrade;
    }

    public void calculateFinalResult() {
        int averageGrade = (sGrade + eGrade) / 2;
        if (averageGrade >= 90) {
            finalResult = "A";
        } else if (averageGrade >= 80) {
            finalResult = "B";
        } else if (averageGrade >= 70) {
            finalResult = "C";
        } else if (averageGrade >= 60) {
            finalResult = "D";
        } else {
            finalResult = "F";
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Sports Grade: " + sGrade);
        System.out.println("Exam Grade: " + eGrade);
        System.out.println("Final Result: " + finalResult);
    }
}
