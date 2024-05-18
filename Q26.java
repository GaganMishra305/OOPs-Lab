import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side length of the square:");
        double squareSide = scanner.nextDouble();
        Shape square = new Square(squareSide);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Volume: " + square.getVolume());

        System.out.println("Enter radius of the circle:");
        double circleRadius = scanner.nextDouble();
        Shape circle = new Circle(circleRadius);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Volume: " + circle.getVolume());

        System.out.println("Enter side length of the cube:");
        double cubeSide = scanner.nextDouble();
        Shape cube = new Cube(cubeSide);
        System.out.println("Cube Area: " + cube.getArea());
        System.out.println("Cube Volume: " + cube.getVolume());

        System.out.println("Enter radius of the sphere:");
        double sphereRadius = scanner.nextDouble();
        Shape sphere = new Sphere(sphereRadius);
        System.out.println("Sphere Area: " + sphere.getArea());
        System.out.println("Sphere Volume: " + sphere.getVolume());

        scanner.close();
    }
}

abstract class Shape {
    abstract double getArea();
    abstract double getVolume();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getVolume() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getVolume() {
        return 0;
    }
}

class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return 6 * side * side;
    }

    @Override
    double getVolume() {
        return side * side * side;
    }
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double getVolume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}

