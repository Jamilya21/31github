import java.util.Scanner;

public class Task05{
    public static void main(String[] args){
        String[] words = {", kid." , "That's where", "and corners", "Doors", "you", "they get"};
        String msg = words[3];
        String msg2 = words[2];
        String msg3 = words[0];
        String msg4 = words[1];
        String msg5 = words[5];
        String msg6 = words[4];
        System.out.println(msg + msg2 + msg3 + msg4 + msg5 + msg6);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the previous electricity meter value: ");
        // int previous = scanner.nextInt();
        // System.out.println("Enter the current electricity meter value: ");
        // int current = scanner.nextInt();

        // int used = previous - current;
        // int toPay = Math.abs(used * 21);

        // System.out.println("You used: " + used + "kWt");
        // System.out.println("Tariff: 21 tg");
        // System.out.println("Should to pay: " + toPay + " tg");
        // scanner.close();
    }
}