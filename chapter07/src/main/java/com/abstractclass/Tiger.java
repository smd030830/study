package com.abstractclass;

public class Tiger extends Animal {
    @Override
    public Object eat(Animal obj) {
        if (obj instanceof Rabbit){
            System.out.println("호랑이는 먹는다"+obj.toString());
        }
        return String.format("%s는 안먹는다",obj.toString());
    }

    @Override
    public void breathe() {
        System.out.println("호랑이는 숨쉰다");
    }
}
