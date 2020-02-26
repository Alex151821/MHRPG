package RolePlayingGame.Monsters;

import java.util.Map;

import RolePlayingGame.Character;
import RolePlayingGame.Move;

import java.util.HashMap;
import java.util.Random;

public class Monster extends Character {
    protected Random random = new Random();

    public Monster(Map<Move, Integer> moves) {
        super(moves);
        this.base_health = random.nextInt(15);
        this.base_attack = random.nextInt(15);
        this.base_defense = random.nextInt(15);
        this.base_speed = random.nextInt(15);

        this.health = (((base_attack * 3) * level) / 30) + level + 10;
        this.attack = (((base_attack * 2) * level) / 30) + level + 10;
        this.defense = (((base_defense * 2) * level) / 30) + level + 10;
        this.speed = (((base_speed * 2) * level) / 30) + level + 10;

    }


}