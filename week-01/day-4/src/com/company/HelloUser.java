package com.company;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Zadejte jméno: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, "+ name);
    }
}
