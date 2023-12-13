import java.util.Scanner;

public class Task10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        double x = scanner.nextDouble();
        double y;

        if (x > 0) {
            y = Math.sin(x) * Math.sin(x);
        } else {
            y = 1 - 2 * Math.sin(x) * Math.sin(x);
        }

        System.out.println("Value of y: " + y);

        scanner.close();
    }
}