//que14: to print Fibonacci 

import java.util.Scanner;

public class Q14 {
    static void printFibonacciWithIteration(int limit){
        int a = 0;
        int b = 1;
        for(int i = 0; i < limit; i++){
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        System.out.println("Fibonacci terms: " + limit);
        printFibonacciWithIteration(limit);
        sc.close();
    }
}
