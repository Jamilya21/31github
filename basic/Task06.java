import java.util.Scanner;

public class Task06{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add spead in km/h :");
        int kilometr = scanner.nextInt();
        System.out.println("Add spead in m/s :");
        int metr = scanner.nextInt();

        int intoMetr = kilometr / 3600;

        if (intoMetr > metr) {
            System.out.println(kilometr + " km/h is greater then " + metr + " m/s");
        } else {
            System.out.println(metr + " m/s is greater then " + kilometr + " km/h");
        }

        scanner.close();
    }
}