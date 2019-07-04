package Practice.HackerBlocks;

import java.util.Scanner;

public class CountTwins {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(countTwins(0,2,str));

    }

    public static int countTwins(int st, int end,String unproc){

        if(unproc.length() == 2){
            return 0;
        }

        if(unproc.charAt(st) == unproc.charAt(end)){
            return countTwins(st,end,unproc.substring(1)) + 1;
        }

        return countTwins(st,end,unproc.substring(1));

    }
}
