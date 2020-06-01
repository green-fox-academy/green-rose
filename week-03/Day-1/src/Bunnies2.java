import java.util.Scanner;

public class Bunnies2 {
    public static void main(String[] args) {
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number+" bunnies has "+ addEars(number)+ " ears.");

    }
    public static int addEars(int n) {
        if (n == 1) {
            return 2;
        } else
            return 3-n%2+addEars(n - 1);

    }
}
