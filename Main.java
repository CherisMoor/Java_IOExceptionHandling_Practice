package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean tryAgain = true;

        while (tryAgain == true) {

            System.out.println("Enter a number");
            int x = input.nextInt();
            System.out.println("Enter a number");
            int y = input.nextInt();
            System.out.println(divideEAFP(x, y));

            System.out.println("Do you want to continue? true/ false");
            tryAgain = input.nextBoolean();
        }
        input.close();

    }

    public static int divideLBYL(int x, int y) {
        // LBYL will look for a specific error
        if (y != 0) {
            return x / y;
        } else {
            return -1;
        }
    }

    public static int divideEAFP(int x, int y) {
        // Similar to a do while loop
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return -1;
        }
    }
}