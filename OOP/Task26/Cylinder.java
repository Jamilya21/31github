public class Cylinder extends Figure{
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getSquare(){
        return 2*Math.PI*radius*(height+radius);
    }

    @Override
    public double getVolume(){
        return Math.PI*Math.pow(radius,2)*height;
    }
}
