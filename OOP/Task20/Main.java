import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int initialSatiety = random.nextInt(100);
        int desiredSatiety = random.nextInt(100);

        if (desiredSatiety < initialSatiety) {
            System.out.println("It's time for the cat to go on a diet!");
            return;
        }

        System.out.println("Initial cat satiety level: " + initialSatiety);
        System.out.println("Desired satiety level for a cat: " + desiredSatiety);

        System.out.print("Enter cat's name: ");
        String catName = scanner.nextLine();
        Cat cat = new Cat(catName, initialSatiety);

        Food fish = new Food("Fish", 10, -5);
        Food meat = new Food("Meat", 8, -3);
        Food milk = new Food("Milk", 5, 10);

        while (cat.getSatiety()< desiredSatiety) {
        
            System.out.println("Choose smt to feed cat:");
            System.out.println("1. Fish");
            System.out.println("2. Meat");
            System.out.println("3. Milk");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cat.feed(fish);
                    break;
                case 2:
                    cat.feed(meat);
                    break;
                case 3:
                    cat.feed(milk);
                    break;
                default:
                    System.out.println("Incorrect, choose again.");
            }
        }
    }
}