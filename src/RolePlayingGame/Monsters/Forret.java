package RolePlayingGame.Monsters;

public class Forret extends Monster {
    public Forret(){
        super();
        name = "Forret";
        level = random.nextInt(5);
        xp = (3*(level*level))/4;

    }
}