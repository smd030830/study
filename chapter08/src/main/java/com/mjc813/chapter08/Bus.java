package com.mjc813.chapter08;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스 달립니다");
    }
    public void checkFare(){
        System.out.println("승차요금 체크합니다");
    }
}
