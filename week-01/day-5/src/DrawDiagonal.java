import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);

        int diagonalNumber = scanner.nextInt();

        for (int i = 1; i <= diagonalNumber; i++) {

            for (int j = 1; j <= diagonalNumber; j++) {
                if (i == 1 || i== diagonalNumber || j == 1 || j== diagonalNumber || i==j) {
                    System.out.print("%");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
