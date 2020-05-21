package com.company;

import java.util.function.DoubleToIntFunction;

public class Cuboid {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double v = 3;

        double surface = 2 * a * b + 2 * a * v + 2 * b * v;
        double volume = a * b * v;

        System.out.println(surface);
        System.out.println(volume);
    }

}
