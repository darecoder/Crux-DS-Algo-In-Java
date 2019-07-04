package Assignment_6;

public class Q4 {
    public static void main(String[] args) {
        pascalPattern(5,0,0);
    }

    public static int pascal_values(int n, int r){
        if(r == 0 || n == r){
            return 1;
        }
        if(r == 1 || r+1 == n){
            return n;
        }

        return (pascal_values(n-1,r-1) + pascal_values(n-1,r));
    }

    public static void pascalPattern(int x, int n,int r){
        if(x == n){
            return;
        }
        if(r > n){
            System.out.println();
            pascalPattern(x,n+1,0);
            return;
        }
        System.out.print(pascal_values(n,r) + " ");
        pascalPattern(x,n,r+1);
        return;
    }
}
