package com.company;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        System.out.print("Input lower number: ");
        Scanner scanner = new Scanner(System.in);
        int lowNumber = scanner.nextInt();
        System.out.print("Input higher number: ");
        int highNumber = scanner.nextInt();
        if (highNumber<lowNumber){
            System.out.println("The second number should be bigger");
        } else {
            for (int i = lowNumber; i < highNumber; i ++) {
                System.out.println(i);
            }
        }

    }
}
