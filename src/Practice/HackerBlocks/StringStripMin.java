package Practice.HackerBlocks;

import java.util.Scanner;

public class StringStripMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer[][] mem = new Integer[n+1][n+1];
        s.nextLine();
        String list = s.nextLine();
        int[] nums = new int[26];
        for (int i = 0; i < 26; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(stripDPitr(list,nums,mem)+1);
    }

//    public static int stringStrip(String list,int[] nums,Integer[][] mem){
//
//        if(list=="" || isValid(list,nums)){
//            return 0;
//        }else{
//            int parts = Integer.MAX_VALUE;
//            for (int i = 1; i <list.length() ; i++) {
//                int l_part =0;
//                int r_part = 0;
//                String leftPart = list.substring(0,i);
//                String rightPart = list.substring(i,list.length());
//                if(mem[0][i] != null){
//                    l_part = mem[0][i];
//                }else{
//                    l_part = stringStrip(leftPart,nums,mem);
//                    mem[0][i] = l_part;
//                }
//                if(mem[i][list.length()] != null){
//                    r_part = mem[i][list.length()];
//                }else{
//                    r_part = stringStrip(rightPart,nums,mem);
//                    mem[i][list.length()] = r_part;
//                }
//                parts  = Math.min(1+ l_part  + r_part,parts);
//            }
//            return parts;
//        }
//    }

    public static int stripDPitr(String  list,int[] nums,Integer[][] mem) {
        int n;
        for (int j = 1; j <= list.length(); j++) {
            for (int i = 0; i <= list.length() - j; i++) {
                n = i + j - 1;
                if (isValid(list.substring(i,n+1), nums)) {
                    mem[i][n] = 1;
                }
                else {
                    mem[i][n] = j;
                    for (int k = i; k < n; k++) {
                        int sum = mem[i][k] + mem[k+1][n];
                        if (sum < mem[i][n])
                            mem[i][n] = sum;
                    }
                }
            }
        }
        return mem[0][list.length()-1] - 1;
    }

    public static boolean isValid(String str,int[] nums){
        for (int i = 0; i < str.length(); i++) {
            if(nums[str.charAt(i) - 'a'] < str.length()){
                return false;
            }
        }
        return true;
    }
}


