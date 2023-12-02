import java.util.Scanner;

public class Task01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the previous electricity meter value: ");
        int previous = scanner.nextInt();
        System.out.println("Enter the current electricity meter value: ");
        int current = scanner.nextInt();

        int used = previous - current;
        int toPay = Math.abs(used * 21);

        System.out.println("You used: " + used + "kWt");
        System.out.println("Tariff: 21 tg");
        System.out.println("Should to pay: " + toPay + " tg");
        scanner.close();
    }
}