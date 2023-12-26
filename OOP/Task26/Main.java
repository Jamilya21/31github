import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите фигуру: 1-сфера, 2-параллелепипед, 3-цилиндр, 4-конус ");
        String numberChoice = sc.nextLine();
        boolean tryAgain;
        int choiceNumber;
        do {
            if (numberChoice.matches("[a-zA-z]+")) {
                numberChoice = sc.nextLine();
                tryAgain = true;
            } else if (Integer.parseInt(numberChoice) <= 0 & Integer.parseInt(numberChoice)>4) {
                System.out.println("Число не должно быть меньше 0 и больше 4");
                numberChoice = sc.nextLine();
                tryAgain = true;
            } else {
                tryAgain = false;
            }
        } while (tryAgain);

    }


}