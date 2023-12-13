import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task13{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int n = rnd.nextInt(15)+1;
        int [] building = new int[n];
        for (int i =0; i< n; i++){
            building[i] = rnd.nextInt(560)+275;
        }
        System.out.println(Arrays.toString(building));
        java.util.Arrays.sort(building);
        System.out.println(Arrays.toString(building));

        scanner.close();
    }
}