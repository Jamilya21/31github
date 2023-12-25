import java.util.InputMismatchException;
import java.util.Scanner;

public class Parallelepiped extends Figure {
    private double length;
    private double width;
    private double height;

    @Override
    public double getSquare() {
        return 2 * (height * length + length * width + height * width);
    }


    public double getVolume() {
        return height * length * width;
    }

}