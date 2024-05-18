//que8- to print the facotial of a number

import java.util.Scanner;

public class Q8 {
    static int fact(int n){
        if(n == 0){
            return 1;
        }else{
            return n * fact(n-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
}
