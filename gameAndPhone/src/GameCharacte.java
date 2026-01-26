class GameCharacter {
    int id;
    String name;
    String cls;
    String sx;
    int hp;
    int mp;
    int str;
    int intel; // int는 키워드이므로 intel로 명명
    int dex;
    int lux;
    String birthDate;

    GameCharacter(int id, String name, String cls, String sx, int hp, int mp, int str, int intel, int dex, int lux, String birthDate) {
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

    void showStatus() {
        System.out.println("캐릭터: " + name + " (" + cls + ") | HP: " + hp + " | STR: " + str + " | INT: " + intel);
    }
}