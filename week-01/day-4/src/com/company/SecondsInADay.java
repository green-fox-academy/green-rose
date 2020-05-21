package com.company;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 23;
        int currentMinutes = 59;
        int currentSeconds = 59;

        int remainingSeconds = ((24-currentHours)*60 - (currentMinutes))*60 - currentSeconds;
        System.out.println(remainingSeconds);
    }
}
