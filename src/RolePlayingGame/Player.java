package RolePlayingGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import RolePlayingGame.Monsters.Monster;

public class Player extends Character {
    Map<String, Integer> inventory = new HashMap<String, Integer>();
    private int money = 0;
    private int loc_x = 1;
    private int loc_y = 2;
    private Monster[] monster_team = new Monster[]{};
    Random random = new Random();

    public Player(String name) {
        this.name = name;
        level = 1;
        health = 100;
        max_health = 100;
        base_speed = random.nextInt(6) + 10;
        base_attack = random.nextInt(6) + 10;
        base_defense = random.nextInt(6) + 10;
        defense = base_defense * level / 4;
        attack = base_attack * level / 4;
        speed = base_speed * level / 4;


    }

    public void addToInventory(String item, int amount) {
        inventory.put("item", new Integer(amount));
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money = this.money + money;
    }

    public int getLoc_x() {
        return loc_x;
    }

    public void setLoc_x(int loc_x) {
        this.loc_x = loc_x;
    }

    public int getLoc_y() {
        return loc_y;
    }

    public void setLoc_y(int loc_y) {
        this.loc_y = loc_y;
    }

    public Monster[] getTeam() {
        return monster_team;
    }

    public void setTeam(Monster[] monster_team) {
        this.monster_team = monster_team;
    }


}