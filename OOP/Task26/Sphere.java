public class Sphere extends Figure{

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare(){
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getVolume(){
        return (4.0 / 3.0)*Math.PI*Math.pow(radius,3);
    }
}
