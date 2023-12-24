public class Main {
    public static void main(String[] args) {
       System.out.println("Введите имя сотрудника");
       System.out.println("Введите фамилию сотрудника");
       System.out.println("Введите год рождения сотрудника");
       System.out.println("Введите год начала работы сотрудника");
        Company.run();

    }

    private static LocalDate enterDate() throws IllegalArgumentException{
        Scanner scanner = new Scanner(System.in);
        try {
            String date = scanner.nextLine();
            LocalDate localDate = LocalDate.parse(date);
            IllegalArgumentException iae = new IllegalArgumentException("Дата не может быть из будущего");
            if (localDate.isAfter(LocalDate.now())) {
                throw iae;
            }
            return localDate;
        } catch (DateTimeParseException ex) {
            System.out.println("Вы ввели неправильный формат данных");
            return enterDate();
        }
    }



}
