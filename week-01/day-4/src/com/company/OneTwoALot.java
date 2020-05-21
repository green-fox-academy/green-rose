package com.company;

import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        System.out.print("Input integer number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        switch(inputNumber) {
            case 0:
                System.out.println("Not enough!");
                break;
            case 1:
                System.out.println("One!");
                break;
            case 2:
                System.out.println("Two!");
                break;
            default:
                System.out.println("A lot!");
        }
    }
}
