package com.company;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int triangleNumber = scanner.nextInt();
        for (int i = 0; i < triangleNumber; i++) {
            for (int j = 1; j <= triangleNumber-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
