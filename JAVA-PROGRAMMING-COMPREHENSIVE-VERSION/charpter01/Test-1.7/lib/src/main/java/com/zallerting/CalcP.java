package com.zallerting;

public class CalcP {
    // 保存计算的结果
    static double result_1, result_2;
    // 统计计算的次数
    static int times_1, times_2;
    public static void main(String[] args) {
        // calculate the value of 4 x (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11)
        for(int i = 1; i <= 11; i += 2) {
            // 计算次数加一
            times_1++;
            if(times_1 % 2 == 1) {
                result_1 += 4.0 / i;
            } else {
                result_1 -= 4.0 / i;
            }
        }
        System.out.println("result_1 = " + result_1);

        // calculate the value of 4 x (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13)
        for(int i = 1; i <= 13; i += 2) {
            // 计算次数加一
            times_2++;
            if(times_2 % 2 == 1) {
                result_2 += 4.0 / i;
            } else {
                result_2 -= 4.0 / i;
            }
        }
        System.out.println("result_2 = " + result_2);
    }
}
