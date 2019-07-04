package Practice.HackerBlocks;

import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberDecode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String code = s.nextLine();
        ArrayList<String> list = new ArrayList<String>();
        printCodes(code,"",list);
        System.out.println(list);
    }

    private static void printCodes(String str, String ans,ArrayList<String> list) {
        if (str.isEmpty()) {
            if(!ans.isEmpty())
                list.add(ans);
            return;
        }

        String ch1 = str.substring(0, 1);
        String unproc = str.substring(1);

        if (Integer.parseInt(ch1) > 0) {
            char code = (char) (Integer.parseInt(ch1) + 'a' - 1);
            printCodes(unproc, ans + code,list);
        }

        if (str.length() >= 2) {
            String ch2 = str.substring(0, 2);
            String ros2 = str.substring(2);

            if (Integer.parseInt(ch2) > 0 && Integer.parseInt(ch2) <= 26) {
                char code = (char) (Integer.parseInt(ch2) + 'a' - 1);
                printCodes(ros2, ans + code,list);
            }
            if (Integer.parseInt(ch2) == 0) {
                printCodes(ros2, ans,list);
            }
        }
    }
}
