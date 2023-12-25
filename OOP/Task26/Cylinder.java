public class Cylinder extends Figure{
    private double radius;
    private double height;

    @Override
    public double getSquare(){
        return 2*Math.PI*radius*(height+radius);
    }

    @Override
    public double getVolume(){
        return Math.PI*Math.pow(radius,2)*height;
    }

}
