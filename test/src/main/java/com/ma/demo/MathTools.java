package com.ma.demo;

public class MathTools {


    public MathTools() {
    }

    // a*b
    public static int mutiply(int a, int b) {
        int c = a * b;
        return c;
    }

    // a%b
    public static int remainder(int a, int b) {
        int c = a % b;
        return c;
    }


    // 判断a是否是偶数
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }


    // a/b
    public static int Divide(int a, int b) {
        int c = a / b;
        return c;
    }

}
