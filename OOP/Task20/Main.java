import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cat's name: ");
        String catName = scanner.nextLine();
        Cat cat = new Cat(catName);

        Food fish = new Food("Fish", 10);
        Food meat = new Food("Meat", 8);
        Food milk = new Food("Milk", 5);

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