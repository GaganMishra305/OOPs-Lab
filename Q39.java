public class Q39 {
    int num1;
    int num2;

    Q39(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void printSum() {
        int sum = this.num1 + this.num2;
        System.out.println("Sum of " + this.num1 + " and " + this.num2 + " is: " + sum);
    }

    public static void main(String[] args) {
        Q39 obj = new Q39(10, 20);
        obj.printSum();
    }
}
