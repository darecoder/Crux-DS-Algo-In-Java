package Practice.CB_May;

import java.util.Scanner;

public class cookoff4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0){
            int r = s.nextInt();
            int c = s.nextInt();
            int[][] ans = new int[r][c];
            char[][] path = new char[r][c];
            for (int i = 0; i < r; i++) {
                String board = s.next();
                for (int j = 0; j < c; j++) {
                    path[i][j] = board.charAt(j);
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
//                    if(path[i][j] == 'R' && j < c-1 && path[i][j+1] != '#'){
//                        ans[i][j+1]++;
//                    }else if (path[i][j] == 'L' && j > 0 && path[i][j-1] != '#'){
//                        ans[i][j]++;
//                    }else if (path[i][j] == 'U' && i > 0 && path[i-1][j] != '#'){
//                        ans[i][j]++;
//                    }else if (path[i][j] == 'D' && i < r-1 && path[i+1][j] != '#'){
//                        ans[i][j]++;
//                    }
                    if(path[i][j] == 'R'){
                        int k = j;
                        while (k < c){
                            ans[i][k]++;
                            k++;
                        }
                    }else if(path[i][j] == 'L'){
                        int k = j;
                        while (k >= 0){
                            ans[i][k]++;
                            k--;
                        }
                    }else if(path[i][j] == 'U'){
                        int k = i;
                        while (k >= 0){
                            ans[k][j]++;
                            k--;
                        }
                    }else if(path[i][j] == 'D'){
                        int k = i;
                        while (k < r){
                            ans[k][j]++;
                            k++;
                        }
                    }
                }
            }

            int cnt = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if(ans[i][j] >= 2 && path[i][j] != '#'){
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}
