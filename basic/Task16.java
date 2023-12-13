import java.util.Scanner;
import java.text.DecimalFormat;

public class Task16{
    public static void main(String[] args){
       
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