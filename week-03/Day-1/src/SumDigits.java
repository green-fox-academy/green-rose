import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("The sum of all digits is "+sumNumber(number));

    }
    public static int sumNumber(int n) {
        if (n/10 == 0) {
            return n%10;
        } else {
            return n%10 + sumNumber(n/10);
        }
    }
}
