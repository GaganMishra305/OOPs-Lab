public class Q22 {
    public static void main(String[] args) {
    Car car = new Car("Toyota", 2020, "Camry");
    Bike bike = new Bike("Yamaha", 2018, true);
    car.displayInfo();
    car.startEngine();
   
    System.out.println();
    bike.displayInfo();
    bike.startEngine();
    }
   }


abstract class Vehicle {
    private String name;
    private int year;
    public Vehicle(String name, int year) {
    this.name = name;
    this.year = year;
    }
    public abstract void startEngine();
    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public int getYear() {
    return year;
    }
    public void setYear(int year) {
    this.year = year;
    }
    public void displayInfo() {
    System.out.println("Vehicle Name: " + name + ", Year: " + year);
    }
   }
   class Car extends Vehicle {
    private String model;
    public Car(String name, int year, String model) {
    super(name, year);
    this.model = model;
    }
    @Override
    public void startEngine() {
    System.out.println("Car " + getName() + " is starting its engine...");
    }
    public String getModel() {
    return model;
    }
    public void setModel(String model) {
    this.model = model;
    }
    @Override
    public void displayInfo() {
    super.displayInfo();
    System.out.println("Model: " + model);
    }
   }
   class Bike extends Vehicle {
    private boolean isSportBike;
    public Bike(String name, int year, boolean isSportBike) {
    super(name, year);
    this.isSportBike = isSportBike;
    }
    @Override
    public void startEngine() {
    System.out.println("Bike " + getName() + " is starting its engine...");
    }
    public boolean isSportBike() {
    return isSportBike;
    }
    public void setSportBike(boolean sportBike) {
    isSportBike = sportBike;
    }
    @Override
    public void displayInfo() {
    super.displayInfo();
    System.out.println("Is Sport Bike: " + isSportBike);
    }
   }
   