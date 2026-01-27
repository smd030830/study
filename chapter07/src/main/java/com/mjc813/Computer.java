package com.mjc813;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r) {
        System.out.println("computer area circle실행");
        return 3.14159 * r * r;
    }
}
