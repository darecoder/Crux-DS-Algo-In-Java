package com.company.Lecture4;

public class Diamond {
    public static void main(String[] args) {
        int n = 4;
        int r = 1;
        int h_mirror = 1;
        while(h_mirror <= 2 * n - 1){
            int c = 1;
            while(c <= n - r){
                System.out.print("  ");
                c++;
            }
            int v_mirror = 1;
            while (v_mirror <= 2 * r - 1){
                System.out.print("* ");
                v_mirror++;
            }
            System.out.println();

            if(h_mirror < n){
                r++;
            }else{
                r--;
            }
            h_mirror++;
        }
    }

}

