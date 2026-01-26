package com.mjc813;

import java.time.LocalDate;

public class GameCharacter {
    public enum Job {
        W("전사"), M("마법사"), A("궁수"), T("도적");
        private final String name;
        Job(String name) { this.name = name; }
        public String getName() { return name; }
    }

    public enum Gender {
        M("남자"), F("여자");
        private final String label;
        Gender(String label) { this.label = label; }
        public String getLabel() { return label; }
    }

    private int id;
    private String name;
    private Job cls;
    private Gender sx;
    private int hp;
    private int mp;
    private int str;
    private int intel;
    private int dex;
    private int lux;
    private LocalDate birthDate;

    public GameCharacter(int id, String name, Job cls, Gender sx, int hp, int mp,
                         int str, int intel, int dex, int lux, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.sx = sx;
        this.hp = hp;
        this.mp = mp;
        this.str = str;
        this.intel = intel;
        this.dex = dex;
        this.lux = lux;
        this.birthDate = birthDate;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }
    public int getMp() { return mp; }
    public void setMp(int mp) { this.mp = mp; }
    public int getStr() { return str; }
    public int getIntel() { return intel; }

    @Override
    public String toString() {
        return String.format("[%d] %s(%s/%s) HP:%d MP:%d",
                id, name, cls.getName(), sx.getLabel(), hp, mp);
    }
}