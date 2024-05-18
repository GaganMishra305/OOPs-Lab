public class Q38 {
    public static void main(String[] args) {
        // Example for "this" operator and the use of "this" keyword
        MyClass obj1 = new MyClass(10);
        obj1.display();

        // Example for "super" keyword
        Child obj2 = new Child();
        obj2.display();

        // Example for static variables and methods
        Example.displayCount();
    }
}

class MyClass {
    int num;

    MyClass(int num) {
        this.num = num;
    }

    void display() {
        System.out.println("Value of num: " + this.num);
    }
}

class Parent {
    int num = 10;

    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    int num = 20;

    void display() {
        System.out.println("Child class method");
        System.out.println("Child class variable num: " + num);
        System.out.println("Parent class variable num: " + super.num);
        super.display();
    }
}

class Example {
    static int count = 0;

    Example() {
        count++;
    }

    static void displayCount() {
        System.out.println("Count: " + count);
    }
}
