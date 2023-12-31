import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Выберите фигуру для расчета:");
            System.out.println("1. Параллелепипед");
            System.out.println("2. Сфера");
            System.out.println("3. Цилиндр");
            System.out.println("4. Конус");

            int choice = sc.nextInt();

            Figure figure;

            switch (choice) {
                case 1:
                    System.out.println("Введите длину, ширину и высоту параллелепипеда:");
                    double length = sc.nextDouble();
                    double width = sc.nextDouble();
                    double height = sc.nextDouble();
                    figure = new Parallelepiped(length, width, height);
                    break;
                case 2:
                    System.out.println("Введите радиус сферы:");
                    double sphereRadius = sc.nextDouble();
                    figure = new Sphere(sphereRadius);
                    break;
                case 3:
                    System.out.println("Введите радиус основания и высоту цилиндра:");
                    double cylinderRadius = sc.nextDouble();
                    double cylinderHeight = sc.nextDouble();
                    figure = new Cylinder(cylinderRadius, cylinderHeight);
                    break;
                case 4:
                    System.out.println("Введите радиус основания и высоту конуса:");
                    double coneRadius = sc.nextDouble();
                    double coneHeight = sc.nextDouble();
                    figure = new Cone(coneRadius, coneHeight);
                    break;
                default:
                    throw new IllegalArgumentException("Выбрана неверная фигура.");
            }

            double volume = figure.getVolume();
            double surfaceArea = figure.getSquare();

            System.out.println("Объем: " + volume);
            System.out.println("Полная площадь поверхности: " + surfaceArea);

        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

}