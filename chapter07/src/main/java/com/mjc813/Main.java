package com.mjc813;

public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("geluxy","silver");

        System.out.println(myPhone.model);
        System.out.println(myPhone.color);
        System.out.println(myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("hello");
        myPhone.receveVoice("hi,i'm tom");
        myPhone.sendVoice("nice to meet you");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}