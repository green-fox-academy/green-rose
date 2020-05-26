

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int triangleNumber = scanner.nextInt();

        for (int i = 1; i <= (int) Math.ceil((double) triangleNumber/2); i++) {
            for (int j = 1; j <= triangleNumber-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = (int) Math.floor((double)triangleNumber/2); i >=1 ; i--) {
            for (int j = 1; j <= triangleNumber-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
