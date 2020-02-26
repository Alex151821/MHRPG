package RolePlayingGame;



public class WorldMap {
    String[][] worldMap = {
            {"Forest", "Desert", "Forest"},
            {"Forest", "Forest", "Forest"},
            {"Forest", "Hometown", "Forest"},
            {"Forest", "Forest", "Forest"}};

    WorldMap(){}
    public String[][] getMap() {
        return worldMap;
    }

}