package com.zallerting;

public class CalcSquareCircumference {
    static double radius = 5.5,
                  circumference,
                  square;
    static final double PI = 3.14;
    public static void main(String[] args) {
        circumference = 2 * radius * PI;
        square = radius * radius * PI;
        System.out.println("circumference = " + circumference);
        System.out.println("square = " + square);
    }
}
