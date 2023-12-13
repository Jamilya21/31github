import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task12{
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 9: ");
        int value = scanner.nextInt();
        for( int i = 1; i<=9 ; i++){
            String format = "%s * %s = %s";
            String solution = String.format(format, value, i, value*i);
            System.out.println(solution);
        }

        scanner.close();
    }
}