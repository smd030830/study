package com.mjc813_test0130;

public class TV implements Remocon{

    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }

    @Override
    public void powerOn() {
        System.out.println("TV power on");
    }
}
