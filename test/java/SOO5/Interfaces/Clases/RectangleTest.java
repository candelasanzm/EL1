package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle r2 = new Rectangle(1.0, 2.0);
        assertEquals(1.0, r2.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r3 = new Rectangle();
        r3.setWidth(1.0);
        assertEquals(1.0, r3.getWidth());
    }

    @Test
    void getLength() {
        Rectangle r2 = new Rectangle(1.0, 2.0);
        assertEquals(2.0, r2.getLength());
    }

    @Test
    void setLength() {
        Rectangle r3 = new Rectangle();
        r3.setLength(2.0);
        assertEquals(2.0, r3.getLength());
    }

    @Test
    void getArea() {
        Rectangle r2 = new Rectangle(1.0, 2.0);
        assertEquals(2.0, r2.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r2 = new Rectangle(1.0, 2.0);
        assertEquals(6.0, r2.getPerimeter());
    }

    @Test
    void testToString() {
        Shape s3 = new Rectangle("red", false, 1.0, 2.0);
        Rectangle r1 = (Rectangle)s3;
        assertEquals(s3, r1.toString());
    }
}