import java.util.Scanner;

public class Task09{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sentence :");
        String sentence1 = scanner.nextLine();
        System.out.println("enter word to finde in sentence :");
        String word = scanner.nextLine();

        int index = sentence1.indexOf(word);
        System.out.println(index); 

        scanner.close();
    }
}