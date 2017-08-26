package com.zallerting;

public class MathPow {
    public static void main(String[] args) {
        System.out.println("a       b       pow(a, b)");
        // Print the table as below:
        // a       b       pow(a, b)
        // 1       2       1
        // 2       3       8
        // 3       4       81
        // 4       5       1024
        // 5       6       15625
        for(int i = 1; i <=5; i++) {
            System.out.println(i + "       " + (i + 1) + "       " + (int)Math.pow(i, i + 1));
        }
    }
}
