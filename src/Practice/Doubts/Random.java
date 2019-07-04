package Practice.Doubts;

import java.util.*;
public class Random {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        permutation("",str,str);
//        Collections.sort(list, (s1, t1) -> - s1.compareTo(t1));
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }

    public static void permutation(String proc, String unproc, String str){
        if(unproc.isEmpty() ){
            if(proc.compareTo(str) > 0){
                System.out.println(proc);
            }
            return;
        }

        char ch  = unproc.charAt(0);
        unproc = unproc.substring(1);

        for (int i = 0; i <= proc.length() ; i++) {
            String first = proc.substring(0,i);
            String second  = proc.substring(i);

            permutation( first + ch + second, unproc, str);
        }
    }
}