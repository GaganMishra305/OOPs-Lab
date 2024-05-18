// que3- check for if a given number is even or odd

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        sc.close();
    }
}
