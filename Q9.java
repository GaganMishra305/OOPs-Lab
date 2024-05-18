//que9: to print the reverse of a number

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0, d;
        
        while(n > 0) {
            d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
        System.out.println(rev);
        sc.close();
    }
}
