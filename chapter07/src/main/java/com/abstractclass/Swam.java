package com.abstractclass;

public class Swam extends Animal {

    @Override
    public Object eat(Animal obj) {
        System.out.println("지렁이는 "+obj+" 못 먹어");
        return null;
    }

    @Override
    public void breathe() {
        System.out.println("지렁이는 숨쉰다");
    }
}
