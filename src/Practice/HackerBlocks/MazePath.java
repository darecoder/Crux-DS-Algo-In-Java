package Practice.HackerBlocks;

import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
//        maze1("",0,0,2,2,list);
        maze2("",0,0,2,2,list);
        System.out.println(list);
    }

    public static void maze1(String path, int pos1, int pos2, int row, int col, ArrayList<String> list){
        if(pos1 == row && pos2 == col){
            list.add(path);
            return;
        }
        if(pos1 > row || pos2 > col){
            return;
        }

        maze1(path+"H",pos1+1, pos2, row, col, list);
        maze1(path+"V", pos1, pos2+1, row, col, list);

    }

    public static void maze2(String path, int pos1, int pos2, int row, int col, ArrayList<String> list){
        if(pos1 == row && pos2 == col){
            list.add(path);
            return;
        }
        if(pos1 > row || pos2 > col){
            return;
        }

        maze2(path+"H",pos1+1, pos2, row, col, list);
        maze2(path+"V", pos1, pos2+1, row, col, list);
        maze2(path+"D", pos1+1, pos2+1, row, col, list);

    }
}
