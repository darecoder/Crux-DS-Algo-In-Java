package codechef.MayChallenge;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0){
            long m = s.nextLong();
            long n = s.nextLong();
            long min = (m < n) ? m : n;
            long max = (m > n) ? m : n;
            long i = 0;
            while (max != 0 && min != 0){
                long temp = min;
                min = max % min;
                max = temp;
                i++;
            }
            if(i % 2 != 0){
                System.out.println("Ari");
            }else {
                System.out.println("Rich");
            }
        }
    }
}
