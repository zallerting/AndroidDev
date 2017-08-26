package com.zallerting;

public class CalcTrangleSquareCircumference {
    static final double WIDTH = 4.5,
                        HIGHT= 7.9;
    static double square, circumference;
    public static void main(String[] args) {
        square = WIDTH * HIGHT;
        circumference = (WIDTH + HIGHT) * 2;
        System.out.println("square = " + square);
        System.out.println("circumference = " + circumference);
    }
}
