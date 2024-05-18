//que2: printing gretaer between threee numbers

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int ma = Math.max(a, Math.max(b,c));

        System.out.println("Largest number = "+ma);
        sc.close();
    }

}
