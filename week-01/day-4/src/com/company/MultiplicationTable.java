package com.company;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Input number to multiplicate: ");
        Scanner scanner = new Scanner(System.in);
        int numberToMultiplicate = scanner.nextInt();
        for (int i = 1; i <= 10; i ++) {
            System.out.println(i + " * " + numberToMultiplicate + " = " + numberToMultiplicate * i);
        }
    }
}
