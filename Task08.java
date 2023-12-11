import java.util.Scanner;
import java.text.DecimalFormat;

public class Task08{
    public static void main(String[] args){

        System.out.println("Enter the numbers. Enter 0 to stop.");
        Scanner scanner = new Scanner(System.in);

        int i = 0, numbersCount = 0, sum = 0;
        i = scanner.nextInt();
        while (i != 0) {
            ++numbersCount;
            sum += i;
            i = scanner.nextInt();
        }
        if(numbersCount != 0)
        System.out.printf("You has entered %d numbers, \nTheir sum is %d, \nAverage of numbers is %f\n", numbersCount, sum, ((float)sum)/numbersCount);
        

        scanner.close();

    }
}