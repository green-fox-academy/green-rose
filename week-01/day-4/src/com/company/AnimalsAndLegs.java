package com.company;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        System.out.println("Chickens:");
        Scanner scanner = new Scanner(System.in);
        int chickens = scanner.nextInt();
        System.out.println("Pigs:");
        int pigs = scanner.nextInt();
        int legs = chickens*2 + pigs*4;
        System.out.println("Mají "+legs+" nohou.");
    }
}
