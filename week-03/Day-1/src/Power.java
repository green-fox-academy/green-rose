import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int x = 1;
        int n = 0;
        System.out.println(powNumber(x, n));

    }
    public static int powNumber(int x, int n) {
        if (n==0) return 1;
        if (x==0) return 0;
        if (n == 1) {
            return x;
        } else {
            return x*powNumber(x,n-1);
        }
    }
}
