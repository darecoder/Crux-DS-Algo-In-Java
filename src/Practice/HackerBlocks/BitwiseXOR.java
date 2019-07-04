package Practice.HackerBlocks;

import java.util.ArrayList;
import java.util.Scanner;

public class BitwiseXOR {
    public static boolean[] prime = new boolean[8192];
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        sieveOfEratosthenes(8191);
//        int t = s.nextInt();

//        while (t-- > 0){
//            int n = s.nextInt();
//            int[] nums = new int[n];
//            for (int i = 0; i < n; i++) {
//                nums[i] = s.nextInt();
//            }
//
//        }

        System.out.println(isprime(3511));
        System.out.println(isprime(3511^3511));
        System.out.println(isprime(3511^3511^3511));
        System.out.println(isprime(3511^3511^3511^3511));


    }

    public static void sieveOfEratosthenes(int n)
    {
        prime[0] = false;
        prime[1] = false;
        for(int i=2;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }

    public static boolean isprime(int n){
        return prime[n];
    }
}
