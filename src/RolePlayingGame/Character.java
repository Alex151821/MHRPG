package RolePlayingGame;

public class Character {
    protected String name;
    protected int base_health;
    protected float health;
    protected float max_health;
    protected int base_speed;
    protected int base_attack;
    protected int base_defense;
    protected int defense;
    protected int attack;
    protected int speed;
    protected float xp;
    protected int level;
    protected long id;

    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getHealth() {
        return health;
    }
    public void setHealth(float health) {
        this.health = health;
    }
    public float getMax_health() {
        return max_health;
    }
    public void setMaxHealth(float max_health) {
        this.max_health = max_health;
    }
    public float getHealthPercent() {
        return (health/max_health);
    }
    public int getBaseSpeed() {
        return base_speed;
    }
    public void setBaseSpeed(int base_speed) {
        this.base_speed = base_speed;
    }
    public int getBaseAttack() {
        return base_attack;
    }
    public void setBaseAttack(int base_attack) {
        this.base_attack = base_attack;
    }
    public int getBaseDefense() {
        return base_defense;
    }
    public void setBaseDefense(int base_defense) {
        this.base_defense = base_defense;
    }
    public float getXp() {
        return xp;
    }
    public void setXp(float xp) {
        this.xp = xp;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

}