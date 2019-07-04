package Practice.HackerBlocks;

//import javafx.util.Pair;

import java.util.*;

public class NewPractice {
//
//    static Scanner sc = new Scanner(System.in);
//
//    class Heap {
//        ArrayList<Pair<Integer,Integer>> list = new ArrayList<>();
//
//        private int parent(int index){
//            return (index - 1)/2;
//        }
//
//        public void add(Integer value){
//            if(list.size() == 0){
//                Pair<Integer,Integer> pr = new Pair<>(value,0);
//                list.add(pr);
//                return;
//            }
//            int ind = list.size();
//            int pntInd = list.indexOf(list.get(parent(ind)));
//            int vh = 0;
//            if(ind == 2*pntInd + 1){
//                vh = list.get(parent(ind)).getValue() - 1;
//            }else {
//                vh = list.get(parent(ind)).getValue() + 1;
//            }
//
//            Pair<Integer,Integer> pr = new Pair<>(value,vh);
//            list.add(pr);
//        }
//
//        public void verticalOrder() {
//            for (int i = 0; i < list.size(); i++) {
//                for (int j = 0 ; j < list.size() - 1 - i; j++) {
//                    if (list.get(j).getValue() > list.get(j+1).getValue()){
//                        Pair<Integer , Integer > temp = list.get(j);
//                        list.set(j,list.get(j+1));
//                        list.set(j+1,temp);
//                    }
//                }
//            }
//            int t = list.get(0).getValue();
//
//            for (int i = 0; i < list.size(); i++) {
//                if(list.get(i).getKey() == -1){
//                    continue;
//                }else {
//                    t = list.get(i).getValue();
//                    break;
//                }
//            }
//
//            System.out.println(t);
//            for (int i = 0; i < list.size(); i++) {
//                if(list.get(i).getKey() != -1) {
//                    if (list.get(i).getValue() == t) {
//                        System.out.print(list.get(i).getKey() + " ");
//                    } else {
//                        System.out.println();
//                        System.out.print(list.get(i).getKey() + " ");
//                        t = t + 1;
//                    }
//                }
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//        NewPractice m = new NewPractice();
//        Heap h = m.new Heap();
//        int num = sc.nextInt();
//        for (int i = 0; i < Math.pow(2,num)-1 ; i++) {
//            int n = sc.nextInt();
//            h.add(n);
//        }
//        h.verticalOrder();
//    }
}
