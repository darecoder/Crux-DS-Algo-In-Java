package Practice.CB_May;

import java.util.ArrayList;
import java.util.Scanner;

public class cookoff5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0){
            int n = s.nextInt();
            int m = s.nextInt();
            int[] drinks = new int[m];
            for (int i = 0; i < m; i++) {
                drinks[i] = s.nextInt();
            }

            int[] want = new int[n];
            int[] fav = new int[n];
            int[] bad = new int[n];
            for (int i = 0; i < n; i++) {
                want[i] = s.nextInt();
                fav[i] = s.nextInt();
                bad[i] = s.nextInt();
            }

            int[] given = new int[n];

            int profit = 0;
            for (int i = 0; i < n; i++) {
                if(drinks[want[i]-1] > 0){
                    profit += fav[i];
                    drinks[want[i]-1]--;
                    given[i] = want[i];
                }else {
                    profit += bad[i];
                }
            }

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                while (drinks[i] > 0){
                    list.add(i+1);
                }
            }

            int ind = 0;
            for (int i = 0; i < n; i++) {
                if(given[i] == 0){
                    given[i] = list.get(ind);
                    ind++;
                }
            }

            System.out.println(profit);
            for (int i = 0; i < n; i++) {
                System.out.print(given[i] + " ");
            }
        }
    }
}
