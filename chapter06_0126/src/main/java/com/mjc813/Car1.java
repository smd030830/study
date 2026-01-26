package com.mjc813;

import lombok.Getter;

public class Car1 {
    @Getter
    private int speed;
    private boolean stop;

    public void setSpeed(int speed) {
        if (speed < 0){
            this.speed = 0;
        }else{
            this.speed = speed;
        }
    }
    public Boolean isStop() {
        return stop;
    }
    public void setStop() {
        if (stop)this.speed = 0;
    }
}
