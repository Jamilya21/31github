public class Dragon extends Player{

    public Dragon(String name, int healthPoint, int defence, int strength, int weapon) {
        super(name, healthPoint, defence, strength, weapon);
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