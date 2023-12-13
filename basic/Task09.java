import java.util.Scanner;

public class Task09{
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DayOfWeek[] days = DayOfWeek.values();
        System.out.print("Enter the day of the week (1-7): ");
        int day = in.nextInt();

        switch (day) {
            case 1:
                System.out.println(days[0].toString());
                System.out.print("\n8.00 Time to wake up, \n9.30 Job \n18.30 Dance class \n23.00 Time to go to sleep");
                break;
            case 2:
                System.out.println(days[1].toString());
                System.out.print("\n8.00 Time to wake up, \n9.30 Job \n19.00-23.00 Free time \n23.00 Time to go to sleep");
                break;
            case 3:
                System.out.println(days[2].toString());
                System.out.print("\n8.00 Time to wake up, \n9.30 Working conference \n18.30 Dance class \n23.00 Time to go to sleep");
                break;
            case 4:
                System.out.println(days[3].toString());
                System.out.print("\n8.00 Time to wake up, \n9.30 Job, \n19.00 Meeting with parents \n23.00 Time to go to sleep");
                break;
            case 5:
                System.out.println(days[4].toString());
                System.out.print("\n8.00 Time to wake up, \n9.30 Job, \n18.00 Meeting with friends \n23.00 Time to go to sleep");
                break;
            case 6:
                System.out.println(days[5].toString());
                System.out.print("\n10.00 Time to wake up, \n12.00 Spring-cleaning \n23.00 Time to go to sleep");
                break;
            case 7:
                System.out.println(days[6].toString());
                System.out.print("\n10.00 Time to wake up, \n12.00 Shopping, 18.00\nMovie night  \n23.00 Time to go to sleep");
                break;          
            default:
                System.out.println("Incorrectly entered day of the week");
                break;
        }
        in.close();   
        System.out.println("This is my code!");
    }
}