package com.mjc813;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        GameCharacter c1 = new GameCharacter(1, "신사임걸", GameCharacter.Job.M, GameCharacter.Gender.F,
                203, 395, 50, 50, 50, 50, LocalDate.of(2010, 1, 1));
        GameCharacter c2 = new GameCharacter(2, "흑색전사", GameCharacter.Job.W, GameCharacter.Gender.M,
                500, 100, 80, 10, 30, 20, LocalDate.of(2015, 5, 20));

        manager.addCharacter(c1);
        manager.addCharacter(c2);

        System.out.println("--- 공격 전 목록 ---");
        manager.printAll();

        System.out.println("\n>>> 흑색전사가 신사임걸을 공격합니다!");
        manager.attackWithStr(2, 1);

        System.out.println("\n--- 공격 후 목록 ---");
        manager.printAll();
    }
}