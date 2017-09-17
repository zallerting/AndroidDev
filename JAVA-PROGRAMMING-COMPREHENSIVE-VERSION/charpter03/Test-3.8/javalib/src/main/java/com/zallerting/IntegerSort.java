package com.zallerting;

import java.util.Scanner;

public class IntegerSort {
    static int num_1, num_2, num_3;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt to enter three integers
        System.out.print("Enter three integers respectively: ");

        // Obtain the inputed three integers
        num_1 = input.nextInt();
        num_2 = input.nextInt();
        num_3 = input.nextInt();
        if(num_1 > num_2 && num_1 > num_3) {
            if(num_2 > num_3) {
              System.out.println(num_3 + " < " + num_2 + " < " + num_1);
            } else {
              System.out.println(num_2 + " < " + num_3 + " < " + num_1);
            }
        } else if(num_2 > num_1 && num_2 > num_3) {
            if(num_1 > num_3) {
                System.out.println(num_3 + " < " + num_1 + " < " + num_2);
            } else {
                System.out.println(num_1 + " < " + num_3 + " < " + num_2);
            }
        } else if(num_3 > num_1 && num_3 > num_2) {
            if (num_1 > num_2) {
                System.out.println(num_2 + " < " + num_1 + " > " + num_3);
            } else {
                System.out.println(num_1 + " < " + num_2 + " < " + num_3);
            }
        }

    }
}
