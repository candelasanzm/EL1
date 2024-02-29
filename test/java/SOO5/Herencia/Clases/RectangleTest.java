package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle r1 = new Rectangle("red", true, 1.0, 1.0);
        assertEquals(1.0, r1.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r1 = new Rectangle("red", true, 1.0, 1.0);
        r1.setWidth(1.0);
        assertEquals(1.0, r1.getWidth());
    }

    @Test
    void getLength() {
        Rectangle r1 = new Rectangle("red", true, 1.0, 1.0);
        assertEquals(1.0, r1.getLength());
    }

    @Test
    void setLength() {
        Rectangle r1 = new Rectangle("red", true, 1.0, 1.0);
        r1.setLength(1.0);
        assertEquals(1.0, r1.getLength());
    }

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle("red", true, 1.0, 1.0);
        assertEquals(1, r1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle("red", true, 1.0, 1.0);
        assertEquals(4, r1.getPerimeter());
    }

    @Test
    void testToString() {
        Shape sh1 = new Shape("red", true);
        Rectangle r1 = new Rectangle("red", true, 1.0, 1.0);
        assertEquals("Rectangle[ " + sh1 + ", width = " + 1.0 + ", length = " + 1.0 +"]", r1.toString());
    }
}