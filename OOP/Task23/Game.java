public class Game {
    private static Game instance;
    private final Player hero;
    private final Player dragon;
    private boolean turnHero = true;

    private Game() {
        hero = new Hero("Hero", 2000, 250, 150, 200, 100 );
        dragon = new Dragon("Dragon", 500,300,200,50);
    }

    public static Game getInstance(){
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void run(){

        int round = 1;
        while (true) {
            String delimiter = "=================";
            print(String.format("%n%s Round %s %s%n", delimiter, round, delimiter));

            if(turnHero){
                step(hero, dragon);
            } else {
                step(dragon, hero);
            }

//            stepHero();
//            stepDragon();
            if (dragon.getHealthPoint() <= 0) {
                print("Hero is win");
                break;
            }
            if (hero.getHealthPoint() <= 0) {
                print("Dragon is win");
                break;
            }

            round ++;
            turnHero = !turnHero;
        }
    }

    private void step(Player attackedPlayer, Player defendingPlayer){
        print(String.format("Turn %s:%n", attackedPlayer.getName()));
        if (attackedPlayer.canAttack()){
            int damage = attackedPlayer.getDamage() - defendingPlayer.getDefence();
            defendingPlayer.setHealthPoint(defendingPlayer.getHealthPoint()-damage);
            print(String.format("%s dealer of damage: %s%n", attackedPlayer.getName(), damage));
            print(String.format("%s have: %s%n" , defendingPlayer.getName(), defendingPlayer.getHealthPoint()));
        } else {
            print(String.format("%s is missing", attackedPlayer.getName()));
        }
    }

//    private void stepHero(){
//        print("Turn hero");
//        if (hero.canAttack()){
//            int damage = hero.getDamage() - dragon.getDefence();
//            dragon.setHealthPoint(dragon.getHealthPoint()-damage);
//            print("Hero dealer of damage: " + damage);
//            print("Dragon have: " + dragon.getHealthPoint() + " health point");
//        } else {
//            print("Hero is sleep");
//        }
//    }
//
//    private void stepDragon(){
//        print("Turn dragon");
//        if (dragon.canAttack()){
//            int damage = dragon.getDamage() - hero.getDefence();
//            hero.setHealthPoint(hero.getHealthPoint()-damage);
//            print("Dragon dealer of damage: " + damage);
//            print("Hero have: " + hero.getHealthPoint() + " health point");
//        } else {
//            print("Dragon is missing");
//        }
//    }

    private void print(String msg){
        System.out.println(msg);
    }
}
