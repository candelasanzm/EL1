package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rectangle2Test {

    @Test
    void testToString() {
        GeometricObject g2 = new Rectangle2(4, 1);
        assertEquals("Rectangle [width = " + 4.0 + ", length = " + 1.0 + "]", g2.toString());
    }

    @Test
    void getArea() {
        GeometricObject g2 = new Rectangle2(4, 1);
        assertEquals(4, g2.getArea());
    }

    @Test
    void getPerimeter() {
        GeometricObject g2 = new Rectangle2(4, 1);
        assertEquals(10, g2.getPerimeter());
    }
}