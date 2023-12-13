import java.util.Scanner;
import java.text.DecimalFormat;

public class Task15{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
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

        scanner.close();
    }
}