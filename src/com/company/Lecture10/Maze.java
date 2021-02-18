package com.company.Lecture10;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(mazeCount(3,4));
//        mazePath("", 3,4);
//        System.out.println(mazeDiagCount(3,4));
        mazeDiagMajor("",3,4);

    }

    public static int mazeCount(int row, int col){
        if(row == 1 && col == 1){
            return 1;
        }

        else if(row ==1 || col == 1){
            return 1;
        }

        int cnt = 0;

        cnt += mazeCount(row-1,col);
        cnt += mazeCount(row,col-1);
        return cnt;
    }

    public static void mazePath(String path,int row, int col){
        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if(row > 1){
            mazePath(path + "H",row-1,col);
        }

        if(col > 1){
            mazePath(path + "V",row,col-1);
        }
    }

    public static int mazeDiagCount(int row, int col){
        if(row == 1 && col == 1){
            return 1;
        }

        int cnt = 0;

        if(row > 1){
            cnt +=mazeDiagCount(row-1,col);
        }

        if(col > 1){
            cnt +=mazeDiagCount(row,col-1);
        }

        if(row > 1 && col > 1){
            cnt +=mazeDiagCount(row-1,col-1);
        }
        return cnt;
    }

    public static void mazeDiagPath(String path,int row, int col){
        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if(row > 1){
            mazeDiagPath(path + "H",row-1,col);
        }

        if(col > 1){
            mazeDiagPath(path + "V",row,col-1);
        }

        if(row > 1 && col > 1){
            mazeDiagPath(path + "D",row-1,col-1);
        }
    }

    public static void mazeDiagMajor(String path,int row, int col){
        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if(row > 1){
            mazeDiagMajor(path + "H",row-1,col);
        }

        if(col > 1){
            mazeDiagMajor(path + "V",row,col-1);
        }

        if(row > 1 && col > 1 && row == col){
            mazeDiagMajor(path + "D",row-1,col-1);
        }
    }

}
