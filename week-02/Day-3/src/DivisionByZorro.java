import java.util.Scanner;

public class DivisionByZorro {
    public static void main(String[] args) {
        System.out.print("Put a number: ");
        Scanner scanner = new Scanner(System.in);
        int div = scanner.nextInt();

        try {
            int result = 10 / div;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by Zorro! Use another hero!");
        }
    }
}


