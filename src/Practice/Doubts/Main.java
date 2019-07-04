package Practice.Doubts;

import java.util.*;
public class Main {
    public static void main(String[] args) {

//        System.out.println("a".substring(1, 1));
        permute("", "abc", "abc");
        System.out.println("-----------------------------------");
        permute2("", "abc", "abc");
    }

    public static void permute(String processed, String unprocessed, String str){
        if (unprocessed.isEmpty()){
            if(str.compareTo(processed) < 0) {
                System.out.println(processed);
            }
            return;
        }

        for (int i = 0; i < unprocessed.length(); i++) {
            char ch = unprocessed.charAt(i);
            String first = unprocessed.substring(0, i);
            String second = unprocessed.substring(i+1);

            permute(processed + ch, first + second, str);
        }
    }

    public static void permute2(String processed, String unprocessed, String str){
        if (unprocessed.isEmpty()){
            if(processed.compareTo(str) > 0) {
                System.out.println(processed);
            }
            return;
        }


        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);

            permute2(first + ch + second, unprocessed, str);
        }
    }
}


