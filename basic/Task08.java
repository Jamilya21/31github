import java.util.Scanner;

public class Task08{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sentence :");
        String sentence = scanner.nextLine();
        sentence = sentence.replace("e", "i");
        System.out.println(sentence);
        sentence = sentence.replace("d", "t");
        System.out.println(sentence); 

        scanner.close();
    }
}