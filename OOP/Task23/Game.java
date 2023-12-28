import java.util.Random;
import java.util.Scanner;

public class Game {
    private static Game instance;
//    private final Player hero;
//    private final Player dragon;
//    private final Player helhound;
    private static final String DELIMITER = "=================";

    private Game() {
//        hero = new Hero("Hero", 2000, 250, 150, 200, 100 );
//        dragon = new Dragon("Dragon", 5000,300,300,50);
//        helhound = new Dragon("Dragon", 5000,300,300,50);
    }

    public static Game getInstance(){
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void run(){
        Player hero = new Hero("Hero", 2000, 250, 150, 200, 100 );

        Random rnd = new Random();
        Player dragon;
        if (rnd.nextBoolean()) {
            dragon = new Dragon("Dragon", 5000, 300, 300, 50);
        } else {
            dragon = new Dragon("Hellhound", 5000, 300, 300, 50);
        }

        int round = 1;
        while (dragon.getHealthPoint() > 0 && hero.getHealthPoint() > 0) {

            print(String.format("%n%s Round %s %s%n", DELIMITER, round, DELIMITER));
            step(hero, dragon);
            defendYourself((Defendible) hero);
            round ++;
            ((Defendible) hero).shieldDown();
        }
    }

    private void step(Player hero, Player dragon){
        choiceAction(hero, dragon);
        print(DELIMITER);
        attackEnemy(dragon, hero);
    }

    private void attackEnemy(Player attackedPlayer, Player defendingPlayer){
        print(String.format("Turn %s:%n", attackedPlayer.getName()));
        if (attackedPlayer.canAttack()){
            int damage = attackedPlayer.getDamage() - defendingPlayer.getDefence();
            defendingPlayer.setHealthPoint(defendingPlayer.getHealthPoint()-damage);
            print(String.format("%s dealer of damage: %s%n", attackedPlayer.getName(), damage));
            print(String.format("%s have: %s health point" , defendingPlayer.getName(), defendingPlayer.getHealthPoint()));
        } else {
            print(String.format("%s is missing", attackedPlayer.getName()));
        }

        if (defendingPlayer.getHealthPoint() <= 0){
            print(String.format("%s win%n", attackedPlayer.getName()));
        }
    }

    private void choiceAction(Player hero, Player dragon){
        print("Choice action:\n" + "1- Attack\n" + "2- Skip a turn\n" + "3 - Defend");

        switch (checkConsole()){
            case 1:
                print("Hero attacking");
                attackEnemy(hero, dragon);
                break;
            case 2:
                print("Hero skips turn");
                break;
            case 3:
                defendYourself((Defendible) hero);
                print("Hero is defending himself");
                break;
            default:
                print("Incorrect input. Tru again");
                choiceAction(hero, dragon);
        }
    }

    private void defendYourself(Defendible hero){
        hero.shieldUp();
    }

    private int checkConsole(){
        return  new Scanner(System.in).nextInt();
    }

    private void print(String msg){
        System.out.println(msg);
    }
}
