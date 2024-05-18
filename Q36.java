
public class Q36 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
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

