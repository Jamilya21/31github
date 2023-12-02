import java.util.Scanner;

public class Task04{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the football club name: ");
        String footballName = scanner.nextLine();
        boolean empty = footballName.isEmpty();
        System.out.println("is empty? " + empty);
        System.out.println(footballName.length());

        ///
        System.out.println("Enter the first surename: ");
        String firstSurename = scanner.nextLine();
        System.out.println("Enter the second surename: ");
        String secondSurname = scanner.nextLine();
        if (firstSurename.length() > secondSurname.length()){
            System.out.println(firstSurename + firstSurename.length());
            System.out.println(firstSurename + " is longer then "+ secondSurname);
        } else {
            System.out.println(secondSurname + secondSurname.length());
            System.out.println(secondSurname + " is longer then "+ firstSurename);
        }
        ///

        
       
        scanner.close();
    }
}