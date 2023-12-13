import java.util.Scanner;
import java.text.DecimalFormat;

public class Task07{
    public static void main(String[] args){
        int maxInt = findMax(5, 10, 3);
        System.out.println("Max of three integers: " + maxInt);

        double maxDouble = findMax(4.5, 8.2, 6.7);
        System.out.println("Max of three doubles: " + maxDouble);
    }

    private static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    private static double findMax(double a, double b, double c) {
        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}