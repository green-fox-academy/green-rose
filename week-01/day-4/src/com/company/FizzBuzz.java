package com.company;

public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.
        String answer;
        for (int i = 1; i <= 100; i++) {
            answer ="";
            if (i%3==0){
                answer += "Fizz";
            }
            if (i%5==0){
                answer += "Buzz";
            }
            if (answer!=""){
                System.out.println(answer);
            } else {
                System.out.println(i);
            }
        }
    }
}

