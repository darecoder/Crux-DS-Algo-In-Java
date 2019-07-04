package Practice.HackerBlocks;

import java.util.Scanner;

public class PrintLCS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = s.nextLine();

        String[][] mem = new String[a.length() + 1][b.length() + 1];

        System.out.println(printLCS(a,b,mem));

    }

    public static String printLCS(String a,String b,String[][] mem){
        for (int i = 0; i <= a.length() ; i++) {
            for (int j = 0; j <= b.length(); j++) {
                if(i == 0 || j == 0){
                    mem[i][j] = "";
                }else {
                    if(a.charAt(i - 1) == b.charAt(j - 1)){
                        mem[i][j] = mem[i-1][j-1] + a.charAt(i - 1);
                    }else{
//                        mem[i][j] = Math.max(mem[i-1][j].length(), mem[i][j-1].length());
                        if(mem[i-1][j].length() >  mem[i][j-1].length()){
                            mem[i][j] = mem[i-1][j];
                        }else {
                            mem[i][j] = mem[i][j - 1];
                        }
                    }
                }
            }
        }
        return mem[a.length()][b.length()];
    }
}
