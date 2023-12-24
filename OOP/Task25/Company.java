import java.util.InputMismatchException;
import java.util.Scanner;

public class Company extends Person {

    public Company(String name, String sureName, int ageBirth, int yearStartJob) {
        super(name, sureName, ageBirth, yearStartJob);
    }

    public static void run() {
        Person person = new Person (String name, String sureName, int ageBirth, int yearStartJob);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your first name:");
            printValidValue(scanner, "[a-zA-Z]+");
            System.out.println("Enter your last name:");
            printValidValue(scanner, "[a-zA-Z]+");
            System.out.println("Enter your birth year");
            printValidValue(scanner, "[0-9]+");
            System.out.println("Enter your work start year");
            printValidValue(scanner, "[0-9]+");
        }
    }

    static void printValidValue(Scanner scanner, String pattern) {

        while (scanner.hasNextLine()) {
            try {
                System.out.println("Data accepted: " + scanner.next(pattern));
                break;
            } catch (NumberFormatException | InputMismatchException exception) {
                System.out.println("You entered incorrect data!");
                scanner.nextLine();
            }
        }
    }
}
