package com.mjc813;

public class Phone {
    public String model;
    public String color;

    public Phone(String model,String color) {
        this.model = model;
        this.color = color;
        System.out.println("생성자 실행");
    }
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
        this.model = getModel();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = getColor();
    }
}
