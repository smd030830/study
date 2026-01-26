package com.mjc813;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
