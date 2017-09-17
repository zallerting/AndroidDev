package com.zallerting;

import java.util.Scanner;

public class CurrencyExchange {
    static double exchange_rate, exchange_amount, target_amount;
    static int exchange_method;
    static String currency_name, exchange_name;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input_1 = new Scanner(System.in);
        // Prompt to enter exchange rate
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        // Obtain the exchange rate
        exchange_rate = input_1.nextDouble();

        // Create another Scanner
        Scanner input_2 = new Scanner(System.in);
        // Prompt to enter 0 or 1
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        // Obtain the exchange method by 0 or 1
        exchange_method = input_2.nextInt();

        // Create third Scanner
        Scanner input_3 = new Scanner(System.in);

        // Check base on inputted is 0 or 1
        if(exchange_method == 0 || exchange_method == 1) {
            switch (exchange_method) {
                case (0):
                    currency_name = "dollar";
                    exchange_name = "yuan";
                    break;
                case (1):
                    currency_name = "yuan";
                    exchange_name = "dollar";
                    break;
            }

            // Prompt to enter exchange amount
            System.out.print("Enter the " + currency_name + " amount: ");
            // Obtain the exchange amount
            exchange_amount = input_3.nextDouble();

            switch (exchange_method) {
                case (0):
                    target_amount = exchange_amount * exchange_rate;
                    System.out.println("$" + exchange_amount + " is " + target_amount
                            + " " + exchange_name);
                    break;
                case (1):
                    target_amount = exchange_amount / exchange_rate;
                    System.out.println(exchange_amount + " " + currency_name + " is "
                            + " $" + target_amount);
                    break;
            }
        } else {
            System.out.println("Input incorrect, please enter 0 or 1.");
        }
    }
}
