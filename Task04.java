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

        System.out.println("Add spead in km/h :");
        int kilometr = scanner.nextInt();
        System.out.println("Add spead in m/s :");
        int metr = scanner.nextInt();

        int intoMetr = kilometr / 3600;

        if (intoMetr > metr) {
            System.out.println(kilometr + " km/h is greater then " + metr + " m/s");
        } else {
            System.out.println(metr + " m/s is greater then " + kilometr + " km/h");
        }

        ///

        System.out.println("Add radius of Circle : ");
        double radius = scanner.nextDouble();
        System.out.println("Add side of square : ");
        double side = scanner.nextDouble();

        double circle = Math.PI * Math.pow(radius, 2);
        double square =  Math.pow(side, 2);

        System.out.println("Area of a circle is :" + circle + "/nArea of a square is :" + square);

        if (square < circle) {
            System.out.println("Area of a square is less then area of a circle");
        } else {
            System.out.println("Area of a circle is less then area of a square");
        }

        /

        System.out.println("enter sentence :");
        String sentence = scanner.nextLine();
        sentence = sentence.replace("e", "i");
        System.out.println(sentence);
        sentence = sentence.replace("d", "t");
        System.out.println(sentence); 

        ///

        System.out.println("enter sentence :");
        String sentence1 = scanner.nextLine();
        System.out.println("enter word to finde in sentence :");
        String word = scanner.nextLine();

        int index = sentence1.indexOf(word);
        System.out.println(index); 

        ///
        System.out.print("Enter value of x: ");
        double x = scanner.nextDouble();
        double y;

        if (x > 0) {
            y = Math.sin(x) * Math.sin(x);
        } else {
            y = 1 - 2 * Math.sin(x) * Math.sin(x);
        }

        System.out.println("Value of y: " + y);

        scanner.close();
    }
}