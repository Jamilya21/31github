import java.util.Scanner;
import java.text.DecimalFormat;

public class Task06{
    public static void main(String[] args){
        //task1
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("First employee salary: ");
        int salary1 = scanner.nextInt();
        System.out.println("Second employee salary: ");
        int salary2 = scanner.nextInt();
        System.out.println("Third employee salary: ");
        int salary3 = scanner.nextInt();

        int highest = Math.max(Math.max(salary1, salary2), salary3);
        int lowest = Math.min(Math.min(salary1, salary2), salary3);
        int difference = highest - lowest;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.0");
        String formattedHighest = decimalFormat.format(highest);
        String formattedLowwest = decimalFormat.format(lowest);
        String formattedDifference = decimalFormat.format(difference);

        System.out.println("Highest paid position: " + formattedHighest + " som");
        System.out.println("Lowest paid position: " +  formattedLowwest + " som");
        System.out.println("Salary difference: " + formattedDifference +" som");

        //task2

        System.out.println("Enter amount of guests: ");
        int guests = scanner.nextInt();
        if (guests <= 1000){
        int total = 1 + guests;
            if (total == 1){
                System.out.println("The cake wouldn't be cut");
            } else if (total %2 == 0 ) {
                int event = total / 2;
                System.out.println("The minimum possible number of cuts in the cake by diameter is " + event);
            } else {
                System.out.println("The minimum possible number of cuts in the cake by radius is " + total);
            }    
        } else {
            System.out.println("Petya coudn't invite so many guests");
        }       

        //task3
        System.out.println("Enter your age in days: ");
        int age = scanner.nextInt();
        int year = age / 365;
        int month = (age % 365) / 30;
        int day = (age % 365) % 30;
        System.out.println("Years: " + year);
        System.out.println("Month: " + month);
        System.out.println("Days: " + day);
        scanner.close();
    }
}