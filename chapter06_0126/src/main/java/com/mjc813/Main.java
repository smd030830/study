package com.mjc813;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Main {
    public static void main(String[] args) {
        Car mycar = new Car("포르쉐");
        Car yourCar = new Car("벤츠");

        mycar.run();
        yourCar.run();

        double result1 = 10*10* Calculator.pi;
        int result2 = Calculator.plus(10,5);
        int result3 = Calculator.minus(10,5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println(Television.info);

        Korean k1 = new Korean("123456-1234567","김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);
        k1.name = "김자바";

        System.out.println("지구 반지름: " + Earth.EARTH_RADIUS);
        System.out.println("지구 표면적 :" +Earth.EARTH_SUFACE_AREA);

        Car1 mycar1 = new Car1();
        mycar1.setSpeed(-50);
        System.out.println(mycar1.getSpeed());

        mycar1.setSpeed(60);
        System.out.println(mycar1.getSpeed());
        if(mycar1.isStop()){
            mycar1.setStop();
        }
        System.out.println(mycar1.getSpeed());

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 객쳋입니다");
        }else {
            System.out.println("다른 객체입니다");
        }
    }

}