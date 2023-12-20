
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial floor of the elevator: ");
        int initialFloor = scanner.nextInt();

        Elevator elevator = new Elevator(initialFloor, 18, 200);

        while (true) {
            System.out.print("Enter the destination floor (1-" + elevator.getMaxFloor() + "): ");
            int toFloor = scanner.nextInt();

            if (elevator.isAllowableFloor(toFloor)) {
                System.out.print("Enter the weight to transport: ");
                int weight = scanner.nextInt();

                if (elevator.isAllowableWeight(weight)) {
                    elevator.move(toFloor);
                } else {
                    System.out.println("Invalid weight. Please enter a valid weight.");
                }
            } else {
                System.out.println("Invalid floor number. Please enter a valid floor.");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String continueChoice = scanner.next().toLowerCase();
            if (!continueChoice.equals("yes")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}