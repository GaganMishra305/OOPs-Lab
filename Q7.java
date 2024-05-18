//que7: to print Fibonacci with and without using recursion

import java.util.Scanner;

public class Q7 {
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

    static void printFibonacciWithoutIteration(int limit, int a, int b, int termsPrinted){
        if(termsPrinted == limit){
            return;
        }else{
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            termsPrinted++;
            printFibonacciWithoutIteration(limit, a, b, termsPrinted);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        System.out.println("Fibonacci with iterations " + limit);
        printFibonacciWithIteration(limit);

        System.out.println("\n\n");

        System.out.println("Fibonacci without iterations " + limit);
        printFibonacciWithoutIteration(limit, 0, 1, 0);
        sc.close();
    }
}
