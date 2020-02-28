package RolePlayingGame;

public class Move {
    String[] kinds = {"physical", "special"};
    String[] types = {"green", "yellow"};
    private String name;
    private int dmg;
    private String type;
    private String kind;

    public Move(String name, int dmg, int type, int kind){
        this.name= name;
        this.dmg = dmg;
        this.type = types[type];
        this.kind = kinds[kind];
    }
    public String getName(){
        return name;
    }
    public int getDMG(){
        return dmg;
    }
    public String getType(){
        return type;
    }
    public String getKind(){
        return kind;
    }
    public String toString(){
        return name + ": \n\tDamage:" + dmg + "\n\tType: "+type+"\n\t"+kind;
    }
}
