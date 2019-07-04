package codechef.LT72;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Another {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while (t-- > 0){
            int[] fr = new int[26];
            String str = s.nextLine();
            for (int i = 0; i < str.length(); i++) {
                fr[str.charAt(i) - 'a']++;
            }
            int cnt = 0;
            for (int i = 0; i < 26; i++) {
                if(fr[i] % 2 != 0){
                    cnt++;
                }
            }

            if(cnt != 0 && cnt <= 3){
                System.out.println("DBS");
            }else {
                System.out.println("!DBS");
            }
        }
    }
}
