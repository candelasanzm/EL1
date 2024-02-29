package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square sq1 = new Square("red", true, 25);
        assertEquals(25, sq1.getSide());
    }

    @Test
    void setSide() {
        Square sq1 = new Square("red", true, 25);
        sq1.setSide(25);
        assertEquals(25, sq1.getSide());
    }

    @Test
    void setWidth() {
        Square sq1 = new Square("red", true, 25);
        assertEquals(25, sq1.getWidth());
    }

    @Test
    void setLength() {
        Square sq1 = new Square("red", true, 25);
        assertEquals(25, sq1.getLength());
    }

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle("red", true, 1.0, 1.0);
        Square sq1 = new Square("red", true, 25);
        assertEquals("Square [" + r1 + "]", sq1.toString());
    }
}