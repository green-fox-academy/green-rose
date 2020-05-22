

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

        /*
        Lukáš pyramid:
        int total = 1;
        int spot = total + total -1;
        for (int i = 0; i < total ; i++) {
            for (int j = 0; j < spot; j++) {
                if (j <spot/2 -i || j > spot/2 +i){
                    System.out.print(" ");
                }
                else System.out.print("*");

            }
            System.out.println();
        }*/
    }
}
