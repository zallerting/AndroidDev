package com.zallerting;

import java.util.Scanner;
import java.util.StringTokenizer;

import javax.net.ssl.SSLContext;

public class ISBN10 {
    static int d1, d10;
    static String isbn;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt to enter 9 digits of an ISBN as integer
        System.out.print("Enter the first 9 digits of an ISBN  as integer: ");

        // Obtain the inputted 9 digits
        isbn = input.next();

        if(isbn.length() == 9) {
            // Calculate the value of d10
            for(int i = 0; i < 9; i++) {
                // 将数字字符转换为对应数字，例如,'0'转换为0
                d10 += (isbn.charAt(i) - 48) * (i + 1);
                d10 %= 11;
            }
            switch (d10) {
                case(10):
                    System.out.println("The ISBN-10 number is " + isbn + 'X');
                    break;
                default:
                    System.out.println("The ISBN-10 number is " + isbn + d10);
            }
        } else {
            System.out.println("Please only enter 9 digits of an ISBN as integer");
        }

    }
}
