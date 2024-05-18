import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius of the circle:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.calculateArea());

        System.out.println("Enter length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter width of the rectangle:");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        scanner.close();
    }
}

class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Circle {
    private double width;

    public Rectangle(double length, double width) {
        super(length);
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return radius * width;
    }
}
