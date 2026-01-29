package com.abstractclass;

public class Main {
    public static void main(String[] args) {
        Fox fox = new Fox();
        Rabbit rabbit = new Rabbit();
        Swam swam = new Swam();
        Tiger tiger = new Tiger();
        fox.eat(rabbit);
    }
}
