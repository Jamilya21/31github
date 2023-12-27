import java.util.Random;

public class Hero extends Player {

    private int shield;

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

//    public void getAttack(Dragon dragon, Hero hero) {
//        Random rnd = new Random();
//        int attack = rnd.nextInt(4) + 1;
//        int damage = 0;
//        int res = 0;
//        if (attack == 1) {
//            System.out.println("Герой атакует " + (hero.strength+hero.weapon) +
//                    "\nГерой не попал в дракона \nДракон спит" +
//                    "\n========================");
//        } else {
//            while (true) {
//                damage = hero.strength + hero.weapon - dragon.getDefence();
//                dragon.setHealthPoint(dragon.getHealthPoint() - damage);
//                res = dragon.getHealthPoint();
//                System.out.println("Герой атакует " + (hero.strength+hero.weapon) +
//                        "\nГерой попал в дракона" +
//                        "\nУрон дракона " + damage +
//                        "\nЖизненная сила дракона " + res +
//                        "\n========================");
//                if (res <= 0) {
//                    System.out.println("Герой победил дракона!!!");
//                    break;
//                }
//                res--;
//            }
//        }
//    }
}