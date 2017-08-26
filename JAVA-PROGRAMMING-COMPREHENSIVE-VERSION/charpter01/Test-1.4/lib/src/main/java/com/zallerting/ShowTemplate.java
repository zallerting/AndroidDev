package com.zallerting;

public class ShowTemplate {
    public static void main(String[] args) {
        System.out.println("a    a^2    a^3");
        for(int i = 1; i < 5; i++) {
            // 判断a^2是否为2位数，是则空格数减1
            if(i * i > 9) {
                System.out.println(i + "    " + i * i + "     " + i * i * i);
            } else {
                System.out.println(i + "    " + i * i + "      " + i * i * i);
            }
        }
    }
}
