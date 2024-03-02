package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {

    @Test
    void testToString() {
        GeometricObject g1 = new Circle2(2);
        assertEquals("Circle [radius = " + 2.0 + "]", g1.toString());
    }

    @Test
    void getArea() {
        GeometricObject g1 = new Circle2(2);
        assertEquals(Math.PI*Math.pow(2,2), g1.getArea());
    }

    @Test
    void getPerimeter() {
        GeometricObject g1 = new Circle2(2);
        assertEquals(2 * Math.PI * 2, g1.getPerimeter());
    }
}