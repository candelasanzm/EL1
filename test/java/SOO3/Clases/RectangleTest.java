package SOO3.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        assertEquals(1.2f, r1.getLength());
    }

    @Test
    void setLength() {
        Rectangle r1 = new Rectangle();
        r1.setLength(5.6f);
        assertEquals(5.6f, r1.getLength());
    }

    @Test
    void getWidth() {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        assertEquals(3.4f, r1.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        r1.setWidth(7.8f);
        assertEquals(7.8f, r1.getWidth());
    }

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        assertEquals(1.2f * 3.4f, r1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        assertEquals(1.2f + 3.4f + 1.2f + 3.4f , r1.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        assertEquals("Rectangle[length = " + 1.2f + " width = " + 3.4f + "]", r1.toString());
    }
}