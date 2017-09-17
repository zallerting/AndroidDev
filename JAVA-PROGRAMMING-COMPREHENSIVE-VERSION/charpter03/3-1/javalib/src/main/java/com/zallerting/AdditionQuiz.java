package com.zallerting;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        // Make two integer numbers
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt to anter the guested number
        System.out.print("What is " + number1 + " + " + number2 + " ? ");

        // Obtain the entered answer
        int answer = input.nextInt();

        // Output the result
        System.out.println(number1 + " + " + number2 + " = " + answer
            + " is " + (number1 + number2 == answer));
    }
}
