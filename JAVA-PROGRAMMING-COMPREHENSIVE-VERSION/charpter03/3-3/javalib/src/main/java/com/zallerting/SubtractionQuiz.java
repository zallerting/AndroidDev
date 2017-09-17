package com.zallerting;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        // Generate two random single-digit integers
        int num_1 = (int)(Math.random() * 10);
        int num_2 = (int)(Math.random() * 10);

        // Check whether num_1 is less than num_2, if true then swap value of them
        if(num_1 < num_2) {
            int tmp = num_1;
            num_1 = num_2;
            num_2 = tmp;
        }

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt to enter the answer
        System.out.print("What is " + num_1 + " + " + num_2 + " ? ");

        // Obtain the entered answer
        int answer = input.nextInt();

        // Check the answer is right or not
        if(num_1 + num_2 == answer) {
            System.out.println("Congrulations! Your answer is right!");
        } else {
            System.out.println("What a shame! You answer this wrongly.");
            System.out.println(num_1 + " + " + num_2 + " should be " + (num_1 + num_2));
        }
    }
}
