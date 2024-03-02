package SOO5.Interfaces.Clases;

public class Circle3 implements GeometricObject2{
    protected double radius;
    public Circle3 (double radius){
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "Circle [radius = " + radius + "]";
    }

    @Override
    public double getPerimiter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
