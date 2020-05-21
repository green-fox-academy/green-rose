package com.company;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int triangleNumber = scanner.nextInt();
        for (int i = 1; i <= triangleNumber; i++) {
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
