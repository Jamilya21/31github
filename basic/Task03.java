import java.util.Scanner;

public class Task03{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the previous electricity meter value: ");
        int previous = scanner.nextInt();
        System.out.println("Enter the current electricity meter value: ");
        int current = scanner.nextInt();
        System.out.println("Enter the number of residents: ");
        int resident = scanner.nextInt();

        int used = Math.abs(previous - current);
        int firstLevel = resident*115;
        double firstToPay = Math.round(firstLevel * 16.24);

        int secondLevel = (resident*190) - firstLevel;
        double secondToPay = Math.round(secondLevel * 21.8);

        int thirdLevel = used - (firstLevel + secondLevel) ;
        double thirdToPay = Math.round(thirdLevel * 25.6);

        System.out.println("You used: ");
        System.out.println("First level: " + firstLevel + "kWt");
        System.out.println("Second level: " + secondLevel + "kWt");
        System.out.println("Third level: " + thirdLevel + "kWt");
       
        System.out.println("Tariff: 16.24 tg, 21.8 tg, 25.6 tg");
        System.out.println("To pay: ");
        System.out.println("First level: " + firstToPay + " tg");
        System.out.println("Second level: " + secondToPay + "tg");
        System.out.println("Third level: " + thirdToPay + "tg");
       
        scanner.close();
    }
}