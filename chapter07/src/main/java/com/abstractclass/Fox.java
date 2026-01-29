package com.abstractclass;

public class Fox extends Animal {
    @Override
    public Object eat(Animal obj) {
        if (obj instanceof Swam||obj instanceof Rabbit){
            System.out.println("Fox은"+ obj.toString()+"먹는다");
        }
        return String.format("%s는 못먹는다",obj.toString());
    }

    @Override
    public void breathe() {
        System.out.println("여우는 숨쉰다");
    }
}
