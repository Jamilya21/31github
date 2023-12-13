import java.util.Scanner;

public class Task04{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the football club name: ");
        String footballName = scanner.nextLine();
        boolean empty = footballName.isEmpty();
        System.out.println("is empty? " + empty);
        System.out.println(footballName.length());
        
        scanner.close();
    }
}