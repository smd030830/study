package com.mjc813;

public class Variable01 {
    public void howToUseVariable() {
        // 1. 변수 초기화 예제 (VariableInitializationExample)
        int value = 30;
        int result = value + 10;
        System.out.println(result);

        // 2. 변수 사용 예제 (VariableUseExample)
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");
        int totalMinutes = (hour * 60) + minute;
        System.out.println("총 " + totalMinutes + "분");

        // 3. 변수 값 교환 예제 (VariableExchangeExample)
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x + ", y:" + y);
    }
}