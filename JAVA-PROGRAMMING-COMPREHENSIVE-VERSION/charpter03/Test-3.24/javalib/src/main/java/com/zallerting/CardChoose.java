package com.zallerting;

public class CardChoose {
    static int random_card, random_huase;
    static String card, huase;
    public static void main(String[] args) {
        // Generate a random card integer between 1 and 13
        random_card = (int)(Math.random() * 13 + 1);
        // Generate a random huase integer between 1 and 4
        random_huase = (int)(Math.random() * 4 + 1);
        // Check card
        switch(random_card) {
            case(1):
                card = "Ace";
                break;
            case(2):
                card = "2";
                break;
            case(3):
                card = "3";
                break;
            case(4):
                card = "4";
                break;
            case(5):
                card = "5";
                break;
            case(6):
                card = "6";
                break;
            case(7):
                card = "7";
                break;
            case(8):
                card = "8";
                break;
            case(9):
                card = "9";
                break;
            case(10):
                card = "10";
                break;
            case(11):
                card = "Jack";
                break;
            case(12):
                card = "Queen";
                break;
            case(13):
                card = "King";
                break;
        }
        // Check huase
        switch (random_huase) {
            case (1):
                huase = "Clubs";
                break;
            case (2):
                huase = "Diamonds";
                break;
            case (3):
                huase = "Hearts";
                break;
            case (4):
                huase = "Spades";
                break;
        }

        // Output the result
        System.out.println("The card you picked is " + card + " of " + huase);
    }
}
