import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(fibNumber(number));

    }
    public static int fibNumber(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibNumber(n - 1)+fibNumber(n - 2);
        }
    }
}
