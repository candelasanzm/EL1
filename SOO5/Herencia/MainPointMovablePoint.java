package SOO5.Herencia;

import SOO5.Herencia.Clases.MovablePoint;
import SOO5.Herencia.Clases.Point;

public class MainPointMovablePoint {
    public static void main (String[] args){
        //Puntos
        Point p1 = new Point(0.0f,0.0f);
        MovablePoint p2 = new MovablePoint(0.0f,0.0f);
        //Imprimir los puntos
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        //Move point
    }
}
