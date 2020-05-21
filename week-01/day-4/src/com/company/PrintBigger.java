package com.company;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        System.out.print("Input other number: ");
        double secondNumber = scanner.nextDouble();
        if (secondNumber>firstNumber){
            System.out.print("The bigger: "+secondNumber);
        } else if (secondNumber<firstNumber){
            System.out.print("The bigger: "+firstNumber);
        } else {
            System.out.print("Both are equal.");
        }
    }
}
