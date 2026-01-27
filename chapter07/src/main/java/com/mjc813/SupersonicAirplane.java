package com.mjc813;

public class SupersonicAirplane extends Airplane {
    public static final int NOMAL =1;
    public static final int SUPerSONIC =2;

    public int flyMode = NOMAL;

    @Override
    public void fly() {
        if(flyMode == SUPerSONIC){
            System.out.println("초음속 비행");
        }else{
            super.fly();
        }
    }
}
