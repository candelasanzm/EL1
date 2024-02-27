package SOO4;

import SOO4.Clases.MyCircle;
import SOO4.Clases.MyPoint;

public class MainMyCircleMyPoint {
    public static void main(String[] args) {
        // Centro del circulo
        MyPoint centro1 = new MyPoint(1, 2);
        MyPoint centro2 = new MyPoint(0, 0);
        //Crear y mostrar el centro
        MyCircle center = new MyCircle(centro1, 1);
        System.out.println(center.toString());
        //Obtener el área
        System.out.println("Área: " + center.getArea());
        //Obtener la longitud de la circunferencia
        System.out.println("Longitud: " + center.getCircumference());
        //Obtener la distancia entre el centro y el origen
        System.out.println("Distancia entre nuestro centro y el origen: " + centro2.distance(centro1));
    }
}
