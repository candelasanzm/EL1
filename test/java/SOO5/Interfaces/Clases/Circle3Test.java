package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle3Test {

    @Test
    void testToString() {
        GeometricObject2 g21 = new Circle3(1);
        assertEquals("Circle [radius = " + 1.0 + "]", g21.toString());
    }

    @Test
    void getPerimiter() {
        GeometricObject2 g21 = new Circle3(1);
        assertEquals(2 * Math.PI, g21.getPerimiter());
    }

    @Test
    void getArea() {
        GeometricObject2 g21 = new Circle3(1);
        assertEquals(Math.PI, g21.getArea());
    }
}