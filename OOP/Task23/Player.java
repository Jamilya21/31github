import java.util.Random;

public abstract class Player implements Attacking{
    protected int healthPoint;
    protected int defence;
    protected int strength;
    protected int weapon;
    private String name;

    protected static final Random RND = new Random();

    protected Player(String name, int healthPoint, int defence, int strength, int weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public abstract int getDamage();

    public String getName() {
        return name;
    }
}
