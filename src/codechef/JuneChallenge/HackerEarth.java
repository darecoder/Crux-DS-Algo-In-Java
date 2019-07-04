package codechef.JuneChallenge;

import java.util.Scanner;

public class HackerEarth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        n = reverse(n);
        int res = 0;

        while (n > 0){
            int rem = n % 10;
            if(rem != 9 && k > 0){
                rem = 9;
                k--;
            }
            res = res*10 + rem;
            n /= 10;
        }

//        n = reverse(res);
        System.out.println(res);
    }

    public static int reverse(int n){
        int res = 0;
        while (n > 0){
            int rem = n % 10;
            res = res*10 + rem;
            n /= 10;
        }
        return res;
    }
}
