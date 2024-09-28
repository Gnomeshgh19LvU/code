package com.ma;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 两道算法题，
 * 一题控制流程，
 * 一题面向对象题，
 * 两个面试题
 */

@Slf4j
public class Questions {

    @Test
    public void test() {
        log.info("test---->{}", "test");
    }


    /**
     * 算法题
     */

    @Test
    public void CountChar() {
/*
         定义一个泛型为String类型的List集合，
         统计该集合中每个字符（注意，不是字符串）出现的次数。
         例如：集合中有”abc”、”bcd”两个元素，
         程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”
*/
    }


    @Test
    public void printPrismatic() {
        // 打印棱形

/*

            *
           ***
          *****
         *******
          *****
           ***
            *

*/
    }


    /**
     * 流程控制
     */
    @Test
    public void control() {
        /*
            计算销售总金额图书批发商店的某本书的零售价是26.5元/本，
            如果客户一次性购买100本以上（包括100本），则每本的价格打9折，
            如果客户一次性购买500本以上（包 括500本），则每本的价格打8折并返回1000元给客户，
            请分别计算购买8本、150本、600本的应付金额是多少。要求购买书的数量从控制台输入。
        */
    }


    /**
     * 面试题
     */

    @Test
    public void interview1() {
        // ==和equals()的区别

    }

    @Test
    public void interview2() {
        // 集合和数组的比较（为什么引入集合）

    }


    /**
     * 面向对象
     */
    @Test
    public void oop() {

    /*  声明一个数学计算工具类MathTools，包含如下方法：

        1、int mutiply(int a, int b)：求a*b

        2、int divide(int a, int b)：求a/b

        3、int remainder(int a, int b)：求a%b

        4、boolean isEven(int a)：判断a是否是偶数
    */

    }
}
