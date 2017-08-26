package com.zallerting;

import java.util.Scanner;

public class AddByEachNum {
    public static void main(String[] args) {
        // Create a input stream
        Scanner input = new Scanner(System.in);
        // Prompt user to enter a number between 0 and 1000
        System.out.print("Enter a number between 1 and 1000: ");
        // Obtain a input integer from the input stream
        int number = input.nextInt();
        // Calculate the geNumber, shiNumber and baiNumber
        int geNumber = number % 10;
        int shibaiNumber = number / 10;
        int shiNumber = shibaiNumber % 10;
        int baiNUmber = shibaiNumber / 10;
        // Calculate the addition of geNUmber, shiNumber and baiNUmber
        int additionEachNumber = geNumber + shiNumber + baiNUmber;
        // Output the addition of geNUmber, shiNumber and baiNUmber
        System.out.println("The sum of the digits is " + additionEachNumber);
    }
}
