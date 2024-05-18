//que4: print primes till a given number

import java.util.Scanner;

public class Q4 {
    static boolean checkPrime(int number){
        for(int i = 2; i <= number/2; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Prime numbers till "+n);
        for(int i = 2; i <= n; i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
