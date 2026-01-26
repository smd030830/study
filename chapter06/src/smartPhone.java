

public class smartPhone {
    class SmartPhone {
        String model;    // 모델명
        String brand;    // 제조사
        int storage;     // 저장 용량 (GB)
        boolean is5G;    // 5G 지원 여부

        void powerOn() {
            System.out.println(model + "의 전원을 켭니다.");
        }

        void showInfo() {
            System.out.println("기기: " + brand + " " + model + " (" + storage + "GB)");
        }
    }
}
