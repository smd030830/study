package com.mjc813_test0130;

public class SoundableExample {
    public static void printSound(Soundable soundable) {
        soundable.sound();
    }

    // static 키워드 추가
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}