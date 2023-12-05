import java.util.Scanner;

public class Task05{
    public static void main(String[] args){
        //task1
        String[] words = {", kid." , " That's where", " and corners", "Doors", " you", " they get"};
        String msg = words[3];
        String msg2 = words[2];
        String msg3 = words[0];
        String msg4 = words[1];
        String msg5 = words[5];
        String msg6 = words[4];
        System.out.println(msg + msg2 + msg3 + msg4 + msg5 + msg6);

        //task2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 9: ");
        int value = scanner.nextInt();
        for( int i = 1; i<=9 ; i++){
            String format = "%s * %s = %s";
            String solution = String.format(format, value, i, value*i);
            System.out.println(solution);
        }

        //task3

        

        scanner.close();
    }
}