package com.mjc813.chapter08;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        ImplClass impl = new ImplClass();
        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodA();
        ib.methodB();

        System.out.println();

        InterefaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
        System.out.println();

        Driver driver = new Driver();
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        driver.drive(taxi);
        driver.drive(bus);
        System.out.println();
        ride(taxi);
        System.out.println();
        ride(bus);
        System.out.println();

        Car myCar = new Car();
        myCar.run();

        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run();
        System.out.println();

        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a;

        a =b;
        a= c;
        a =d;
        a= e;

        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
    }










    private static void ride(Vehicle vehicle) {
//        if (vehicle instanceof Bus) {
//            Bus bus = (Bus) vehicle;
//            bus.run();
//        }
        if (vehicle instanceof Bus bus) {
            bus.checkFare();
        }
        vehicle.run();
    }
}