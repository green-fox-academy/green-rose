import java.util.Scanner;

public class Bunnies {
    public static void main(String[] args) {
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number+" bunnies has "+ addEars(number)+ " ears.");

    }
    public static int addEars(int n) {
        if (n == 1) {
            return 2;
        } else {
            return n + addEars(n - 1);
        }
    }
}
