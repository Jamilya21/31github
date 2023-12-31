public class Cone extends Figure{
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getSquare() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double getVolume(){
        return (1.0 / 3.0)*Math.PI*Math.pow(radius,2)*height;
    }

}
