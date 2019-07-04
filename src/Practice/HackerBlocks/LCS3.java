package Practice.HackerBlocks;

import java.util.Scanner;

public class LCS3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = s.nextLine();
        String c = s.nextLine();

        Integer[][][] mem = new Integer[a.length() + 1][b.length() + 1][c.length() + 1];

        System.out.println(LCS3(a,b,c,mem));

    }

    public static int LCS3(String a,String b,String c,Integer[][][] mem){
        int i,j = 0,k = 0;

        for (i = 0; i <= a.length(); i++) {
            for (j = 0; j <= b.length(); j++) {
                for (k = 0; k <= c.length(); k++) {
                    if(i == 0 || j == 0 || k == 0){
                        mem[i][j][k] = 0;
                    }else if(a.charAt(i - 1) == b.charAt(j - 1) && b.charAt(j - 1) == c.charAt(k - 1)){
                        mem[i][j][k] = 1 + mem[i - 1][j - 1][k - 1];
                    }else{
                        mem[i][j][k] = Math.max(mem[i - 1][j][k],Math.max(mem[i][j - 1][k],mem[i][j][k - 1]));
                    }
                }
            }
        }

        return mem[a.length()][b.length()][c.length()];
    }
}
