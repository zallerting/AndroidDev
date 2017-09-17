package com.zallerting;

import java.util.Scanner;

public class Palindromic {
    static int palindromic, isPalindromic;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter a Palindromic number
        System.out.print("Enter a three-didit Palindromic: ");
        // Obtain the inputted Palindromic
        palindromic = input.nextInt();

        // Check the inputted is or not a Palindromic
        isPalindromic = (palindromic / 100 == palindromic % 10) ? 1 : 0;

        switch (isPalindromic){
            case (1):
                System.out.println(palindromic + " is a palindrome.");
                break;
            case (0):
                System.out.println(palindromic + " is not a palindrome.");
                break;
        }
    }
}
