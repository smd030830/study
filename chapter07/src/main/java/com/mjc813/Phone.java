package com.mjc813;

public class Phone {
    public String model;
    public String color;

    public void bell(){
        System.out.println("belling");
    }
    public void sendVoice(String message){
        System.out.println("본인"+message);
    }
    public void receveVoice(String message){
        System.out.println("상대방"+message);
    }
    public void hangUp(){
        System.out.println("전화 끊음");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
