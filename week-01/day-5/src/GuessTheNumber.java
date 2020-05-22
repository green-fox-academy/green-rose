import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int guessedNumber = 10;
        int evalNumber;
        System.out.print("Guess the number: ");
        do {

            Scanner scanner = new Scanner(System.in);
            evalNumber = scanner.nextInt();
            if (evalNumber<guessedNumber) System.out.print(" The stored number is higher, guess again: ");
            else if (evalNumber>guessedNumber) System.out.print(" The stored number is lower, guess again: ");

        } while (evalNumber!=guessedNumber);
        System.out.print(" You found the number: "+evalNumber);

    }

}
