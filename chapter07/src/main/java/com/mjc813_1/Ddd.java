package com.mjc813_1;

import com.mjc813.Aaa;
public class Ddd extends Aaa {
    public Ddd() {
        super();
    }
    public void method() {
        this.field = "Value";
        this.method();
    }
//    public void method2() {
//        Aaa aaa = new Aaa();
//        aaa.field = "Value";
//        aaa.method();
//    }
}
