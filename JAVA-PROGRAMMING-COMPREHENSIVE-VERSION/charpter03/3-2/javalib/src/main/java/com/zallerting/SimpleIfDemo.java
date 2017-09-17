package com.zallerting;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt to enter a number
        System.out.print("Enter an integer: ");

        // Obtain the entered integer
        int number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println("HiFive");
        }
        if (number % 2 == 0) {
            System.out.println("HiEven");
        }

    }
}
