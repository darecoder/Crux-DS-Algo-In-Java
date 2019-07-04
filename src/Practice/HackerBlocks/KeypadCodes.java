package Practice.HackerBlocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KeypadCodes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] alpha = {"","abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wx" , "yz"};
        String str = s.nextLine();
        ArrayList<String> res = getcodes(str,alpha);
        Collections.sort(res);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
        System.out.println();
        System.out.println(res.size());

    }

    public static ArrayList<String> getcodes(String str, String[] alpha){

        if(str.isEmpty()){
            ArrayList<String> res = new ArrayList<String>();
            res.add("");
            return res;
        }

        char c_cur = str.charAt(0);
        int c_num = c_cur - '0';
        String rest = str.substring(1);

        ArrayList<String> rec_Res = getcodes(rest,alpha);
        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < rec_Res.size() ; i++) {
            String recString = rec_Res.get(i);
            String code = alpha[c_num];

            for (int j = 0; j < code.length(); j++) {
                char ch = code.charAt(j);
                result.add(ch + recString);
            }
        }
        return result;
    }
}