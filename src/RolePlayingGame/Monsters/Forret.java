package RolePlayingGame.Monsters;

import RolePlayingGame.Move;

import java.util.Map;

public class Forret extends Monster {
    public Forret(Map<Move, Integer> moves) {
        super(moves);
        name = "Forret";
        level = random.nextInt(5);
        xp = (3 * (level * level)) / 4;

    }
}