package SOO5.Herencia.Clases;

public class Square extends Rectangle{
    private double side;
    public Square() {
    }
    public Square (double side){
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color,filled,side,side); // side equivale a length y width
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side){
        this.side = side;
    }
    public void setLength(double side){
        this.side = side;
    }
    public String toString(){
        return "Square [" + super.toString() + "]";
    }
}
