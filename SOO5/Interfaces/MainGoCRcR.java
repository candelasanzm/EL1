package SOO5.Interfaces;

import SOO5.Interfaces.Clases.Circle3;
import SOO5.Interfaces.Clases.GeometricObject2;
import SOO5.Interfaces.Clases.Resizable;
import SOO5.Interfaces.Clases.ResizableCircle;

public class MainGoCRcR {
    public static void main (String[] args){
        GeometricObject2 g21 = new Circle3(1);
        System.out.println(g21);
        System.out.println(g21.getPerimiter());
        System.out.println(g21.getArea());

        Circle3 c1 = (Circle3)g21;
        System.out.println(c1);
        System.out.println(c1.getPerimiter());
        System.out.println(c1.getArea());

        Resizable r1 = new ResizableCircle(1);
        System.out.println(r1);
        r1.resize(20);

        ResizableCircle rc1 = (ResizableCircle)r1;
        System.out.println(rc1);
        rc1.resize(20);
    }
}
