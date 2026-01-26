public class Main {
    public static void main(String[] args) {

        System.out.println("--- 과제 2: 스마트폰 ---");
        SmartPhone galaxy = new SmartPhone("S25+", "Galaxy", 1350000);
        SmartPhone iphone = new SmartPhone("14 Pro", "iPhone", 1550000);
        galaxy.showInfo();
        iphone.showInfo();

        System.out.println("\n--- 과제 3: 닌텐도 게임 ---");
        NintendoGame game = new NintendoGame("마리오 카트", "스포츠", "ALL", 64800, "./img/0108.png");
        game.printGameInfo();

        System.out.println("\n--- 과제 4: RPG 캐릭터 ---");
        GameCharacter c1 = new GameCharacter(1, "신사임걸", "마법사", "여자", 203, 395, 50, 50, 50, 50, "2010-01-01");
        GameCharacter c2 = new GameCharacter(2, "흑색전사", "전사", "여자", 203, 395, 50, 50, 50, 50, "2010-01-01");

        c1.showStatus();
        c2.showStatus();
    }
}