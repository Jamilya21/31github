public class Dragon{
    private int healthPoint;
    private int defence;
    private int strength;
    private int weapon;

    public Dragon(int healthPoint, int defence, int strength, int weapon){
        this.healthPoint = healthPoint;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
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

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }
}