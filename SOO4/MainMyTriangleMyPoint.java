package SOO4;

import SOO4.Clases.MyTriangle;
import SOO4.Clases.MyPoint;

public class MainMyTriangleMyPoint {
    public static void main(String[] args) {
        // Puntos del triángulo
        MyPoint punto1 = new MyPoint(1, 2);
        MyPoint punto2 = new MyPoint(5, 7);
        MyPoint punto3 = new MyPoint(4, 1);
        //Mostrar los puntos
        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
        System.out.println(punto3.toString());
        //Crear y mostrar un triángulo usando los puntos
        MyTriangle triangle = new MyTriangle(punto1, punto2, punto3);
        System.out.println(triangle.toString());
        //Obtener el perímetro
        System.out.println("Perímetro: " + triangle.getPerimeter());
        //Obtener el tipo de triángulo
        System.out.println("Tipo de triángulo: " + triangle.getType());
    }
}
