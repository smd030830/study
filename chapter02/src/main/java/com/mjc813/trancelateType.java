package com.mjc813;

public class trancelateType {
    public void useTranslate(){
        byte result1 = 10 + 20;
        System.out.println("result1 : " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;
        System.out.println("result2 : " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v5 + v4;
        System.out.println("result3 : " + result3);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4 : " + result4);
        System.out.println("result4 : " + (char)result4);

        int v8 = 10;
        int result5 = v8/4;
        System.out.println("result5 : " + result5);

        int v9 = 10;
        double result6 = v9/4.0;
        System.out.println("result6 : " + result6);

        int v10 = 1;
        int v11 = 2;
        double result7 = v10/v11;
        System.out.println("result7 : " + result7);
    }
    public void useTranslate2(){
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean result3 = Boolean.parseBoolean("true");

        System.out.println("result1 : " + value1);
        System.out.println("result2 : " + value2);
        System.out.println("result3 : " + result3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
    }
}
