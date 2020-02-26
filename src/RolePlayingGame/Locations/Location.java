package RolePlayingGame.Locations;

public class Location {
    private String name;
    protected String[] MonRoster;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getMonRoster() {
        return MonRoster;
    }

    public void setMonRoster(String[] monRoster) {
        MonRoster = monRoster;
    }

}
