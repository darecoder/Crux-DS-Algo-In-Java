package codechef.JuneChallenge;

import java.util.Scanner;

public class he3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int r = s.nextInt();
        int n = s.nextInt();
        int num1, num2;
        if(l % n != 0){
            num1 = l + (n - (l % n));
        }else {
            num1 = l;
        }

        if(r % n != 0){
            num2 = r - (l % n);
        }else {
            num2 = r;
        }

        int ans;
        if(num1 <= r && num2 >= l){
            ans = (num2/n) - (num1/n) + 1;
        }else {
            if(num1 <= r || num2 >= l){
                ans = 1;
            }else {
                ans = 0;
            }
        }

        System.out.println(ans);

    }
}
