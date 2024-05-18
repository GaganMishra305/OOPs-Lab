//que18-  wap to print the following number patterns

import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length 'n' for the patterns: ");
        int n = scanner.nextInt();
        
        System.out.println("Pattern A:");
        printPatternA(n);
        
        System.out.println("\nPattern B:");
        printPatternB(n);
        
        System.out.println("\nPattern C:");
        printPatternC(n);
        
        System.out.println("\nPattern D:");
        printPatternD(n);
        
        scanner.close();
    }

    public static void printPatternA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPatternB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void printPatternC(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    public static void printPatternD(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i - j + 1) + " ");
            }
            System.out.println();
        }
    }
}

