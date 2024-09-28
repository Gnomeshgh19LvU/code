package com.ma.demo;

import org.junit.Test;

import java.math.BigInteger;
import java.util.*;

/**
 * 两道算法题，
 * 一题控制流程，
 * 一题面向对象题，
 * 两个面试题
 */
public class Answer {
    
    /**
     * 算法题
     */

    @Test
    public void CountChar() {
        // 统计字符串中每个字符出现的次数
        List<String> list = new ArrayList<>();
        list.add("abc 65$q38334fvgfda");
        list.add("bcd");

        Map<Character, Integer> map = new HashMap<>();//保存每个字符的统计结果
        //统计个数
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            char[] chars = str.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                char c = chars[j];
                int count = 1;
                if (map.containsKey(c)) {
                    count = map.get(c) + 1;
                }
                map.put(c, count);
            }
        }
        //将最终统计结果展示在控制台
        for (char key : map.keySet()) {
            System.out.print(key + "=" + map.get(key) + " ");
        }
    }

    @Test
    public void printPrismatic() {
        // 打印棱形

        // 打印菱形先打印正三角再打印倒三角
        // 1、分析内层循环、外层循环和空格的关系
        // j代表外层循环（控制行）       0      1      2       3
        // k内层循环（控制空格输出）     3      2      1        0
        // i代表内层循环（控制列）       *     ***   *****   *******

/*
           *
          ***               j-k的关系：  k=3-j
         *****
        *******             j-i的关系：  i=2*j+1
*/
        //打印正三角
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 3 - j; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2 * j + 1; i++) {
                System.out.print("*");
            }
            System.out.println();

        }

/*
        *******
         *****
          ***
           *
*/
        //打印倒三角
        for (int j = 2; j >= 0; j--) {
            for (int k = 0; k < 3 - j; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2 * j + 1; i++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }


    /**
     * 流程控制题
     */
    @Test
    public void control() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要购买的书的数量");
        int num = input.nextInt();
        double price = 26.5;
        if (num >= 500) {
            System.out.println("购买" + num + "本书，应付金额是：" + (num * (price * 0.8) - 1000));
        } else if (num >= 100) {
            System.out.println("购买" + num + "本书，应付金额是：" + num * (price * 0.9));
        } else
            System.out.println("购买" + num + "本书，应付金额是：" + num * price);
        //购买8本书，应付金额是：212.0
        //购买150本书，应付金额是：3577.5
        //购买600.0本书，应付金额是：11720.0
    }

    /**
     * 面试题
     */
    @Test
    public void interview1() {
/*      ==和equals()的区别

        equals()和==最大的区别一个是方法，一个是运算符

        ==：如果对象时基本数据类型，则比较的是数值是否相等；如果是引用数据类型，比较的则是对象的地址值是否相等
        equals():用来比较方法两个对象的内容是否相等
*/
    }

    @Test
    public void interview2() {
/*      集合和数组的比较（为什么引入集合）

        数组不是面向对象的，存在明显的缺陷，集合完全弥补了数组的一些缺点，比数组更灵活更实用，可大大提高软件的开发效率而且不同的集合框架类可适用于不同场合。具体如下：
        数组的效率高于集合类.
        数组能存放基本数据类型和对象，而集合类中只能放对象。
        数组容量固定且无法动态改变，集合类容量动态改变。
        数组无法判断其中实际存有多少元素，length只告诉了array的容量。
        集合有多种实现方式和不同的适用场合，而不像数组仅采用顺序表方式。
        集合以类的形式存在，具有封装、继承、多态等类的特性，通过简单的方法和属性调用即可实现各种复杂操作，大大提高软件的开发效率。
*/
    }

    /**
     * 面向对象
     */
    @Test
    public void MathTools() {
        new MathTools();
        System.out.println(MathTools.mutiply(1, 2));
        System.out.println(MathTools.Divide(4, 2));
        System.out.println(MathTools.remainder(4, 2));
        System.out.println(MathTools.isEven(2));
    }
}
