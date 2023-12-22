import java.util.Random;

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

    public void setShield(int shield) {
        this.shield = shield;
    }

    public void getAttack(Dragon dragon, Hero hero) {
        Random rnd = new Random();
        int attack = rnd.nextInt(4) + 1;
        int damage = 0;
        int res = 0;
        if (attack == 1) {
            System.out.println("Герой атакует " + (hero.strength+hero.weapon) +
                    "\nГерой не попал в дракона \nДракон спит" +
                    "\n========================");
        } else {
            while (true) {
                damage = hero.strength + hero.weapon - dragon.getDefence();
                dragon.setHealthPoint(dragon.getHealthPoint() - damage);
                res = dragon.getHealthPoint();
                System.out.println("Герой атакует " + (hero.strength+hero.weapon) +
                        "\nГерой попал в дракона" +
                        "\nУрон дракона " + damage +
                        "\nЖизненная сила дракона " + res +
                        "\n========================");
                if (res <= 0) {
                    System.out.println("Герой победил дракона!!!");
                    break;
                }
                res--;
            }
        }
    }
}