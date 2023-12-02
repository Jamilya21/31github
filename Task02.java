import java.util.Scanner;

public class Task02{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solving ax2 + bx + c = 0: ");
        System.out.println("Enter value for a: ");
        double a = scanner.nextInt();
        System.out.println("Enter value for b: ");
        double b = scanner.nextInt();
        System.out.println("Enter value for c: ");
        double c = scanner.nextInt();

        double d = Math.pow(b, 2) -4*a*c ;
        double x1 =  (-b + (Math.sqrt(d)))/2*a;
        System.out.println(d);
        System.out.println("First root of the equation: " + x1);
        double x2 = (-b - (Math.sqrt(d)))/2*a;
        System.out.println("Second root of the equation: " + x2 );
        scanner.close();
    }
}