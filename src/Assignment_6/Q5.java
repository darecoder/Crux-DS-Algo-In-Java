package Assignment_6;

public class Q5 {
    public static void main(String[] args) {
        System.out.println(triangle(5));
    }

    public static int triangle(int n){
        if(n == 1){
            return 1;
        }

        return n + triangle(n-1);
    }

}
