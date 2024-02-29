package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1 = new Circle("red", true, 1.0);
        assertEquals(1.0, c1.getRadius());
    }

    @Test
    void setRadius() {
        Circle c1 = new Circle("red", true, 1.0);
        c1.setRadius(1.0);
        assertEquals(1.0, c1.getRadius());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle("red", true, 1.0);
        assertEquals(Math.PI, c1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle("red", true, 1.0);
        assertEquals(2*Math.PI, c1.getPerimeter());
    }

    @Test
    void testToString() {
        Shape sh1 = new Shape("red", true);
        Circle c1 = new Circle("red", true, 1.0);
        assertEquals("Circle [" + sh1 + ", radius = " + 1.0 + "]", c1.toString());
    }
}