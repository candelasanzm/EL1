package SOO5.Interfaces;

import SOO5.Interfaces.Clases.Circle2;
import SOO5.Interfaces.Clases.GeometricObject;
import SOO5.Interfaces.Clases.Rectangle2;

public class MainGeometricCircleRectangle {
    public static void main(String [] args){
        GeometricObject g1 = new Circle2(2);
        System.out.println(g1);
        System.out.println(g1.getArea());
        System.out.println(g1.getPerimeter());

        Circle2 c21 = (Circle2)g1;
        System.out.println(c21);
        System.out.println(c21.getArea());
        System.out.println(c21.getPerimeter());

        GeometricObject g2 = new Rectangle2(4, 1);
        System.out.println(g2);
        System.out.println(g2.getArea());
        System.out.println(g2.getPerimeter());

        Rectangle2 r1 = (Rectangle2)g2;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
