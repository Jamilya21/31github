import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television(1, 5);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Next Channel\n2. Previous Channel\n3. Switch to Channel\n4. Display Current Channel\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tv.nextChannel();
                    break;
                case 2:
                    tv.previousChannel();
                    break;
                case 3:
                    System.out.print("Enter channel number: ");
                    int channelNumber = scanner.nextInt();
                    tv.switchToChannel(channelNumber);
                    break;
                case 4:
                    tv.displayCurrentChannel();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}