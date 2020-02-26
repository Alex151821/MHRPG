package RolePlayingGame.Monsters;

import RolePlayingGame.Move;

import java.util.Map;

public class Forret extends Monster {
    public Forret() {
        //super(moves);
        name = "Forret";
        level = random.nextInt(5);
        xp = (3 * (level * level)) / 4;
        type = "green";
    }
}