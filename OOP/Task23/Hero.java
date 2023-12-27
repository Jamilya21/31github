import java.util.Random;

public class Hero extends Player  implements Defendible{

    private int shield;

    private boolean defend = false;

    public Hero(String name, int healthPoint, int defence, int strength, int weapon, int shield) {
        super(name, healthPoint, defence, strength, weapon);
        this.shield = shield;
    }


    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    @Override
    public boolean canAttack() {
        return RND.nextInt(100) > 25;
    }

    @Override
    public int getDamage() {
        return strength + weapon;
    }

    public boolean idDefend(){
        return defend;
    }


    @Override
    public void shieldUp() {
        if (!defend) {
            defence = defence + shield;
            defend = true;
        }

    }

    @Override
    public void shieldDown() {
        if (defend) {
            defence = defence - shield;
            defend = false;
        }
    }
}