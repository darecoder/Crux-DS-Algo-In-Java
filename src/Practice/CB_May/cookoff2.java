package Practice.CB_May;

import java.util.Scanner;

public class cookoff2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        while (t-- > 0){
            int n = Integer.parseInt(s.nextLine());
            String ans = s.nextLine();
            String tried = s.nextLine();
            int score = calScore(ans, tried);
            System.out.println(score);
        }

    }

    public static int calScore(String ans, String tried) {
        int score = 0;

        for (int i = 0; i < ans.length(); i++) {
            if(ans.charAt(i) == tried.charAt(i)){
                score++;
            }else if(tried.charAt(i) == 'N'){
                continue;
            }else if(ans.charAt(i) != tried.charAt(i)) {
                i++;
            }
        }

        return score;
    }
}
