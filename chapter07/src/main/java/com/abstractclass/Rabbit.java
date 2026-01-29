package com.abstractclass;
import com.abstractclass.Animal;

import static java.lang.String.*;

public class Rabbit extends Animal {
    @Override
    public Object eat(Animal obj) {
        if (obj instanceof Swam){
            System.out.println("Rabbit은"+ obj.toString()+"먹는다");
        }
        return String.format("%s는 못먹는다",obj.toString());
    }

    @Override
    public void breathe() {
        System.out.println("토끼는 숨쉰다");
    }
}
