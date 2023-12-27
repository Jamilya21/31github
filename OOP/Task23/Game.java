public class Game {
    private static Game instance;
    private final Player hero;
    private final Player dragon;

    private Game() {
        hero = new Hero(2000, 250, 150, 200, 100 );
        dragon = new Dragon(500,300,200,50);
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

            step();
            if (dragon.getHealthPoint() <= 0) {
                print("Hero is win");
                break;
            }
            if (hero.getHealthPoint() <= 0) {
                print("Dragon is win");
                break;
            }

            round ++;

        }
    }

    private void step(){
        print("Turn hero");
        if (hero.canAttack()){
            int damage = hero.getDamage() - dragon.getDefence();
            dragon.setHealthPoint(dragon.getHealthPoint()-damage);
            print("Hero dealer of damage: " + damage);
            print("Dragon have: " + dragon.getHealthPoint() + " health point");
        } else {
            print("Hero is missing");
        }
    }

    private void print(String msg){
        System.out.println(msg);
    }
}
