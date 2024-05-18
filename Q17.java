//que17:  print the given aptterns n-times

import java.util.Scanner;

public class Q17{

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
        
        System.out.println("\nPattern E:");
        printPatternE(n);
        
        System.out.println("\nPattern F:");
        printPatternF(n);
        
        System.out.println("\nPattern G:");
        printPatternG(n);
        
        System.out.println("\nPattern H:");
        printPatternH(n);
        
        scanner.close();
    }

    public static void printPatternA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPatternB(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPatternC(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPatternD(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
    }

    public static void printPatternE(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
    }

    public static void printPatternF(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j == n - i + 1 || j == n + i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPatternG(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i==j) || (i+j == n+1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printPatternH(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
