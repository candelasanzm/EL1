package SOO5.Herencia;
import SOO5.Herencia.Clases.Shape;
import SOO5.Herencia.Clases.Circle;
import SOO5.Herencia.Clases.Rectangle;
import SOO5.Herencia.Clases.Square;

public class MainSquareCircleRectangleSquare {
    public static void main(String [] args){
        //Constructores
        Shape sh1 = new Shape("red", true);
        Circle c1 = new Circle("red", true, 1.0);
        Rectangle r1 = new Rectangle("red", true, 1.0, 1.0);
        Square sq1 = new Square("red", true, 25);
        //Enseñar datos
        System.out.println(sh1.toString());
        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println(sq1.toString());
        //Mostrar resultados de funcions
        System.out.println(sh1.isFilled());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
