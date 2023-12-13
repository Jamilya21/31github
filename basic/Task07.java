import java.util.Scanner;

public class Task07{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add radius of Circle : ");
        double radius = scanner.nextDouble();
        System.out.println("Add side of square : ");
        double side = scanner.nextDouble();

        double circle = Math.PI * Math.pow(radius, 2);
        double square =  Math.pow(side, 2);

        System.out.println("Area of a circle is :" + circle + "/nArea of a square is :" + square);

        if (square < circle) {
            System.out.println("Area of a square is less then area of a circle");
        } else {
            System.out.println("Area of a circle is less then area of a square");
        }

        scanner.close();
    }
}