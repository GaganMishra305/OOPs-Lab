//que13- to print the multiplicaiton table of 'n' till 'm' in java

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 1; i <= m; i++){
            System.out.println(n + " * " + i + " = " + i * n);
        }
        sc.close();
    }
}
