package codechef.MayChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int n = s.nextInt();
            ArrayList<Long> list = new ArrayList<>();
            for (long i = 1; i < n+1; i++) {
                list.add(i);
            }
            long i = 0, M = 1000000007;
            while (n-- > 1){
                long x = list.get(list.size()-2);
                long y = list.get(list.size()-1);
                list.add(list.size()-2 , (x + y + x*y) % M);
                list.remove(list.size()-1);
            }

            System.out.println(list.get(0));
        }
    }
}
