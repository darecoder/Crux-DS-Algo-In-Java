package Practice.HackerBlocks;

import java.util.ArrayList;
import java.util.Scanner;

public class VerticalOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        ArrayList<ArrayList<Integer>> heap = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0,0);
        list1.add(0,s.nextInt());
        for (int i = 1; i < Math.pow(2,n) - 1; i++) {
            list1.add(s.nextInt());
            int ind = (i-1)/2;
            if(2*ind + 1 == i){
                list2.add(list2.get((i-1)/2)-1);
            }else{
                list2.add(list2.get((i-1)/2)+1);
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < list2.size() - 1 - i; j++) {
                if(list2.get(j) > list2.get(j+1)){
                    int temp1 = list1.get(j);
                    list1.set(j,list1.get(j+1));
                    list1.set(j+1,temp1);
                    int temp2 = list2.get(j);
                    list2.set(j,list2.get(j+1));
                    list2.set(j+1,temp2);
                }
            }
        }
        int t = 0;
        for (int i = 0; i < list2.size(); i++) {
            if(list1.get(i) == -1){
                continue;
            }else {
                t = list2.get(i);
                break;
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) != -1) {
                if (list2.get(i) == t) {
                    System.out.print(list1.get(i) + " ");
                } else {
                    System.out.println();
                    System.out.print(list1.get(i) + " ");
                    t = t + 1;
                }
            }
        }

    }
}
