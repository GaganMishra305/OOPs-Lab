//que11 : printing random number in a given range

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int ans = (int)(Math.random()*((max-min)+1));
        System.out.println(ans);
        sc.close();
    }
}
