package SOO5.Herencia;

import SOO5.Herencia.Clases.Point2D;
import SOO5.Herencia.Clases.Point3D;

public class MainPoint2DPoint3D {
    public static void main (String[] args) {
        //Puntos
        Point2D p2D1 = new Point2D(0, 0);
        Point3D p3D1 = new Point3D(0, 0, 0);
        //Mostrar puntos por pantalla
        System.out.println(p2D1.toString());
        System.out.println(p3D1.toString());
    }
}
