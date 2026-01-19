package com.mjc813;

public class Main {
    public static void main(String[] args) {
        chapter03 chp3 = new chapter03();

        chp3.third01();
        chp3.third01_2();
        chp3.third02();
        chp3.third03();
        chp3.third04();

        equationFirst equationFirst = new equationFirst();
        System.out.println("2x + 8 =0, x=" + equationFirst.equationFirst(2,8));
        System.out.println("5x -30 =0, x=" + equationFirst.equationFirst(5,30));
        System.out.println("7x + 49 =0, x=" + equationFirst.equationFirst(7,49));

        operatorExample operatorExample = new operatorExample();
        operatorExample.operatorTest1();
        operatorExample.operatorTest2();
        operatorExample.operatorTest3();
        operatorExample.operatorTest4();
        operatorExample.operatorTest5();
        operatorExample.operatorTest6();
        operatorExample.operatorTest7();
    }
}