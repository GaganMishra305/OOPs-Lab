//que6 - swapping numbers with and without third variable

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Original number");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped number(with third variable)");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("Swapped number(without third variable)");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        sc.close();
    }
}
