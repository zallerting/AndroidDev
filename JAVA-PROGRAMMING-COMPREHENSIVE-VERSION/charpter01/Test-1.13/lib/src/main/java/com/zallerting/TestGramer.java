package com.zallerting;
import java.util.Scanner;

public class TestGramer {
    public static void main(String[] args) {
        // 监控键盘输入
        Scanner input = new Scanner(System.in);
        // 依次获取键盘输入
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double x, y;
        x = (e * d - b * f) / (a * d - b * c);
        y = (a * f - e * c) / (a * d - b * c);
        System.out.println("x is " + (int)(x * 1000) / 1000);
        System.out.println("y is " + (int)(y * 1000) / 1000);
    }
}
