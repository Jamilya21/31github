public class Cone extends Figure{
    private double radius;
    private double height;

//площадь конуса формула нужна
//    public double getSquareCylinder(){
//        return 2*Math.PI*radius*(height+radius);
//    }

    @Override
    public double getSquare() {
        return 0;
    }

    @Override
    public double getVolume(){
        return (1/3)*Math.PI*Math.pow(radius,2)*height;
    }

}
