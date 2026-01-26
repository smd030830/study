import org.lombok.*;

class SmartPhone {
    String model;
    String brand;
    int price;

    SmartPhone(String model, String brand, int price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    void showInfo() {
        System.out.println("모델: " + brand + " " + model + " | 가격: " + price + "원");
    }
}