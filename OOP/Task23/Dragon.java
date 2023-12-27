public class Dragon extends Player{

    public Dragon(int healthPoint, int defence, int strength, int weapon) {
        super(healthPoint, defence, strength, weapon);
    }

    @Override
    public int getDamage() {
        return strength + weapon;
    }

    @Override
    public boolean canAttack() {
        return RND.nextBoolean();
    }
}