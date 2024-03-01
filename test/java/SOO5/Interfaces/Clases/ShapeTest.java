package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s1 = new Circle("red", false, 5.5);
        assertEquals("red", s1.getColor());
    }

    @Test
    void setColor() {
        Shape s1 = new Circle("red", false, 5.5);
        s1.setColor("red");
        assertEquals("red", s1.getColor());
    }

    @Test
    void isFilled() {
        Shape s1 = new Circle("red", false, 5.5);
        assertTrue(s1.isFilled());
    }

    @Test
    void setFilled() {
        Shape s1 = new Circle("red", false, 5.5);
        s1.setFilled(false);
        assertTrue(s1.isFilled());
    }

    @Test
    void getArea() {
        Shape s1 = new Circle();
    }

    @Test
    void getPerimeter() {
        Shape s1 = new Circle();
    }

    @Test
    void testToString() {
        Shape s1 = new Circle("red", false, 5.5);
        assertEquals(s1, s1.toString());
    }
}