
public class Parallelepiped extends Figure {
    private double length;
    private double width;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    private double height;

    @Override
    public double getSquare() {
        return 2 * (height * length + length * width + height * width);
    }


    public double getVolume() {
        return height * length * width;
    }

}