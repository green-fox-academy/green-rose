import java.util.Scanner;

public class NumberAdder {
    public static void main(String[] args) {
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Sum of 1.."+number+" is "+addNumber(number));

    }
    public static int addNumber(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + addNumber(n - 1);
        }
    }
}
