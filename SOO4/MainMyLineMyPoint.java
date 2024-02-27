package SOO4;

import SOO4.Clases.MyPoint;
import SOO4.Clases.MyLine;

public class MainMyLineMyPoint {
    public static void main(String[] args) {
        // Crear dos puntos
        MyPoint punto1 = new MyPoint(1, 2);
        MyPoint punto2 = new MyPoint(4, 6);
        //Mostrar los puntos
        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
        //Calcular y mostrar la distancia entre los puntos
        System.out.println("La distancia entre los dos puntos es: " +punto1.distance(punto2));
        //Crear y mostrar una línea usando los dos puntos
        MyLine line = new MyLine(punto1, punto2);
        System.out.println(line.toString());
        //Obtener la longitud de la línea
        System.out.println("longitud; " + line.getLength());
        //Obtener el ángulo de la línea
        System.out.println("Ángulo: " + line.getGradien());
    }
}
