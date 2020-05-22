import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);

        int squareNumber = scanner.nextInt();
        for (int i = 1; i <= squareNumber; i++) {

            for (int j = 1; j <= squareNumber; j++) {
                if (i == 1 || i== squareNumber) {
                    System.out.print("%");
                }
                else {
                    if (j == 1 || j== squareNumber) System.out.print("%");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
