package com.mjc813;

public class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model,String color) {
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("wifi 변경됨");
    }
    public void internet(){
        System.out.println("인터넷 연결");
    }
}
