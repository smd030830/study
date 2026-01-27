package com.mjc813;

public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시","메탈실버");

        System.out.println(myPhone.model);
        System.out.println(myPhone.color);
        System.out.println(myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("hello");
        myPhone.receveVoice("hi, I'm tom");
        myPhone.sendVoice("nice to meet you");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();

        int r =10;
        Calculator calculator = new Calculator();
        System.out.println("원 면적: "+calculator.areaCircle(r));
        System.out.println();
        Computer computer = new Computer();
        System.out.println("원 면적: "+computer.areaCircle(r));

        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPerSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NOMAL;
        sa.fly();
        sa.land();

        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();
        //parent.method3();
    }
}