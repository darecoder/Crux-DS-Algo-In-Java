package Practice.HackerBlocks;


import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class BishopMoves {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int n = s.nextInt();
            int p = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }

            int ans = solve(n,p,a);
            System.out.println(ans);
        }
    }

    public static int solve(int n, int p, int[] a){
        int ans = Integer.MAX_VALUE,res,temp = a[0];

        for (int i = 0; i < n; i++) {
            temp = temp & a[i];
            res = Math.abs(p - temp);
            if(ans > res){
                ans = res;
            }else{
                if(i < n-1){
                    temp = a[i+1];
                }
            }
        }

        return ans;
    }

}
