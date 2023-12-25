public class Sphere extends Figure{
    private double radius;

    @Override
    public double getSquare(){
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getVolume(){
        return (4/3)*Math.PI*Math.pow(radius,3);
    }
}
