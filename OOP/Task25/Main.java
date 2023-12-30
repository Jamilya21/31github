import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите имя: ");
            String firstName = scanner.nextLine();

            System.out.print("Введите фамилию: ");
            String lastName = scanner.nextLine();

            System.out.print("Введите год рождения: ");
            int birthYear = readInt(scanner);

            System.out.print("Введите год начала работы: ");
            int startYear = readInt(scanner);

            validateInput(birthYear, startYear);

            Person person = new Person(firstName, lastName, birthYear, startYear);
            int workExperience = person.calculateWorkExperience();

            System.out.println("Общий рабочий стаж: " + workExperience + " лет");

        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }

    private static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Введите целое число.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void validateInput(int birthYear, int startYear) throws Exception {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        if (birthYear > currentYear || startYear > currentYear) {
            throw new Exception("Введен год из будущего.");
        }

        if (startYear < birthYear + 18) {
            throw new Exception("Год начала работы не может быть раньше, чем год, когда работнику исполнилось 18 лет.");
        }
    }
}
