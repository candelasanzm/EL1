package SOO5.Herencia;

import SOO5.Herencia.Clases.MovablePoint;
import SOO5.Herencia.Clases.Point2D;

public class MainPointMovablePoint {
    public static void main (String[] args){
        //Puntos
        Point2D p1 = new Point2D(2.0f,1.0f);
        MovablePoint p2 = new MovablePoint(4.0f,3.0f);
        MovablePoint p3 = new MovablePoint(2.0f,1.0f,4.0f, 3.0f);
        //Imprimir los puntos
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        //Move point
        System.out.println(p3.move());
    }
}
