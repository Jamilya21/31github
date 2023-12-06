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

        //task3

        

        scanner.close();
    }
}