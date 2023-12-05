import java.util.Scanner;

public class Task06{
    public static void main(String[] args){
        //task1
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("First employee salary: ");
        int salary1 = scanner.nextInt();
        System.out.println("Second employee salary: ");
        int salary2 = scanner.nextInt();
        System.out.println("Third employee salary: ");
        int salary3 = scanner.nextInt();

        // if (salary1 >= salary2 || salary1 >= salary3){

        // }

        System.out.println("Highest paid position: " + " som");
        System.out.println("Lowest paid position: " + " som");
        System.out.println("Salary difference: " + " som");

        // for( int i = 1; i<=9 ; i++){
        //     String format = "%s * %s = %s";
        //     String solution = String.format(format, value, i, value*i);
        //     System.out.println(solution);
        // }

        //task3

        

        scanner.close();
    }
}