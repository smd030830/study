class NintendoGame {
    String name;
    String genre;
    String grade;
    int price;
    String imgUrl;

    NintendoGame(String name, String genre, String grade, int price, String imgUrl) {
        this.name = name;
        this.genre = genre;
        this.grade = grade;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    void printGameInfo() {
        System.out.println("게임: " + name + " [" + genre + "] | 등급: " + grade + " | 가격: " + price + "원");
    }
}