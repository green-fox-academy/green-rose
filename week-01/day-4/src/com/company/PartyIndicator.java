package com.company;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        System.out.print("Input number of girls: ");
        Scanner scanner = new Scanner(System.in);
        int girls = scanner.nextInt();
        System.out.print("Input number of boys: ");
        int boys = scanner.nextInt();

        if (girls<=0){
            System.out.print("Sausage party");
        } else if (girls+boys<20){
            System.out.print("Average party...");
        } else if (girls==boys){
            System.out.print("The party is excellent!");
        } else System.out.print("Quite cool party!");
    }
}
