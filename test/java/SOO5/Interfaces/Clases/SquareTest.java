package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square s3 = new Square(6.6);
        assertEquals(6.6, s3.getSide());
    }

    @Test
    void setSide() {
        Square s2 = new Square();
        s2.setSide(6.6);
        assertEquals(6.6, s2.getSide());
    }

    @Test
    void setWidth() {
        Square s1 = new Square("red", false, 6.6);
        s1.setWidth(6.6);
        assertEquals(6.6, s1.getWidth());
    }

    @Test
    void setLength() {
        Square s1 = new Square("red", false, 6.6);
        s1.setLength(6.6);
        assertEquals(6.6, s1.getLength());
    }

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle("red", false, 1.0, 2.0);
        Square s3 = new Square(6.6);
        assertEquals("Square [" + r1 + "]", s3.toString());
    }
}