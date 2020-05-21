package com.company;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        double MILE_IN_KM = 1.609344;
        System.out.println("Zadejte vzdálenost v mílích:");
        Scanner scanner = new Scanner(System.in);
        double miles = scanner.nextDouble();
        System.out.println(miles +" miles is "+ MILE_IN_KM*miles + " Km");

    }
}
