package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape sh1 = new Shape("red", true);
        assertEquals("red", sh1.getColor());
    }

    @Test
    void setColor() {
        Shape sh1 = new Shape("red", true);
        sh1.setColor("red");
        assertEquals("red", sh1.getColor());
    }

    @Test
    void isFilled() {
        Shape sh1 = new Shape("red", true);
        assertTrue(sh1.isFilled());
    }

    @Test
    void setFilled() {
        Shape sh1 = new Shape("red", true);
        sh1.setFilled(true);
        assertTrue(sh1.isFilled());
    }

    @Test
    void testToString() {
        Shape sh1 = new Shape("red", true);
        assertEquals("Shape [ color = " + "red" + ", filled = " + true + "]", sh1.toString());
    }
}