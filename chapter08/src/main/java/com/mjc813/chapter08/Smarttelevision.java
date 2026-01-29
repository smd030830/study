package com.mjc813.chapter08;

public class Smarttelevision implements searchable,RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("TV를 킵니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void setMute(boolean mute) {
        RemoteControl.super.setMute(mute);
    }

    @Override
    public void search(String url) {
        System.out.println(url +"을 검색합니다");
    }
}
