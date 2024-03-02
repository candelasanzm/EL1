package SOO5.Interfaces.Clases;

public class Circle2 implements GeometricObject{
    private double radius;
    public Circle2 (double radius){
        this.radius = radius;
    }
    public String toString(){
        return "Circle [radius = " + radius + "]";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

}
