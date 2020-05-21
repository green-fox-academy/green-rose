package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        char tryAgain = 'y';
        while (tryAgain == 'y'){
            System.out.print("Input integer number: ");
            Scanner scanner = new Scanner(System.in);
            int inputNumber = scanner.nextInt();
            if (inputNumber%2 == 0){
                System.out.println("Even!");
            } else {
                System.out.println("Oddd!");
            }
            System.out.println("Guess again [y/n]: ");
            String inputAgain = scanner.next();
            tryAgain = inputAgain.charAt(0);
        }

    }
}
