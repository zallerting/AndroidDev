package com.zallerting;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        // 从键盘获取的输入流
        Scanner input = new Scanner(System.in);

        // 提醒从终端输入3个数字
        System.out.print("Enter three numbers:");

        // 获取从终端输入的3个数字
        double number_1 = input.nextDouble();
        double number_2 = input.nextDouble();
        double number_3 = input.nextDouble();

        // 计算3个数的平均数
        double average = (number_1 + number_2 + number_3 ) / 3;
        // 显示结果
        System.out.println("The average of " + number_1 +
        " " + number_2 + " " + number_3 + " is " + average);

    }
}
