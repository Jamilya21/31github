public class Hero{
    private int healthPoint;
    private int defence;
    private int strength;
    private int weapon;
    private int shield;

    public Hero(int healthPoint, int defence, int strength, int weapon, int shield){
        this.healthPoint = healthPoint;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
        this.shield = shield;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getDefence() {
        return defence;
    }

    public int getStrength() {
        return strength;
    }

    public int getWeapon() {
        return weapon;
    }

    public int getShield() {
        return shield;
    }
}