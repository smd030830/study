package com.mjc813;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CharacterManager {
    private List<GameCharacter> characters = new ArrayList<>();
    private static int nextId = 5;

    public void addCharacter(GameCharacter character) {
        characters.add(character);
    }
        public Optional<GameCharacter> findById(int id) {
        return characters.stream().filter(c -> c.getId() == id).findFirst();
    }
    public void attackWithStr(int attackerId, int targetId) {
        GameCharacter attacker = findById(attackerId).orElse(null);
        GameCharacter target = findById(targetId).orElse(null);

        if (attacker != null && target != null) {
            target.setHp(target.getHp() - attacker.getStr());
            checkDeath(target);
        }
    }
    private void checkDeath(GameCharacter character) {
        if (character.getHp() <= 0) {
            System.out.println(character.getName() + "이(가) 사망했습니다.");
            characters.remove(character);
        }
    }

    public void printAll() {
        characters.forEach(System.out::println);
    }
}