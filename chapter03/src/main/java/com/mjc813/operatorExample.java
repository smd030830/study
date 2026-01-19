package com.mjc813;

public class operatorExample {
    public void operatorTest1(){
        int x =10;
        int y =20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
    public void operatorTest2(){
        int score =85;
        String result = (!(score>90))? "A":"B";
        System.out.println(result);
    }
    public void operatorTest3(){
        int pencils = 534;
        int students =30;
        //학생 한명이 가질 수 있는 연필 수
         int pencilsPerStudent = pencils/students;
         System.out.println(pencilsPerStudent);

         //남은 연필수
         int pencilsLeft = pencils%pencilsPerStudent;
         System.out.println(pencilsLeft);
    }
    public void operatorTest4(){
        int value = 356;
        System.out.println((value - (value % 100)));
    }
    public void operatorTest5(){
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;

        double area = (double) (lengthTop+lengthBottom)*height/2.0;
        System.out.println(area);
    }
    public void operatorTest6(){
        int x =10;
        int y = 5;
        System.out.println((x>7) && (y<=5));
        System.out.println(x%3 ==2 || y%2 ==1);
    }
    public void operatorTest7(){
        double x =5.0;
        double y = 0.0;
        double z = 5 % y;
        if(y <= 0){
            System.out.println("can't divide by zero");
        }else {
            double result = z + 10;
            System.out.println(result);
        }
    }
    public void rooping(){
        int i =0;
        int  j = 100;
        for( ; i<=50 && j >=50;){

        }
    }
}
