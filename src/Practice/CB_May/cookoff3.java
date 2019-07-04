package Practice.CB_May;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class cookoff3 {
    public static class Taste implements Comparable<Taste>{
        public int day;
        public int val;

        public Taste(int day, int val) {
            this.day = day;
            this.val = val;
        }

        @Override
        public int compareTo(Taste other) {
            if(other.val > this.val){
                return 1;
            }else if(other.val < this.val){
                return -1;
            }else{
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0){
            int dishes = s.nextInt();
            int day = s.nextInt();
            Taste[] tastes = new Taste[dishes];
            for (int i = 0; i < dishes; i++) {
                tastes[i] = new Taste(s.nextInt(), s.nextInt());
            }

            Arrays.sort(tastes);

            HashSet<Integer> set = new HashSet<>();
            int sum = tastes[0].val;
            set.add(tastes[0].day);
            for (int i = 1; i < dishes; i++) {
                if(!set.contains(tastes[i].day)){
                    sum += tastes[i].val;
                    break;
                }
            }

            System.out.println(sum);
        }
    }
}
