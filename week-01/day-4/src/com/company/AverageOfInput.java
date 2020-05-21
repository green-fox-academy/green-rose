package com.company;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        int MAX = 5;
        int soucet = 0;
        for (int i = 1; i <= MAX; i++) {
            System.out.println("Zadejte "+ i +". číslo:");
            Scanner scanner = new Scanner(System.in);
            int inputNumber = scanner.nextInt();
            soucet = soucet + inputNumber;
        }
        System.out.println("Součet je " + (int)soucet);
        System.out.println("Průměr je " + (float)soucet/MAX);
    }
     
}
