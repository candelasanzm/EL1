package SOO3.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle c1 = new Circle();
        assertEquals(1.0, c1.getRadius());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle c1 = new Circle(1.0);
        c1.setRadius(2.0);
        assertEquals(2.0, c1.getRadius(), "Fallo, no coinciden los radios");
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle c1 = new Circle(1.0);
        assertEquals(Math.PI, c1.getArea());
    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        Circle c1 = new Circle(1.0);
        assertEquals(2 * Math.PI, c1.getCircumference());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle c1 = new Circle(1.0);
        assertEquals("Circle[radius = " + 1.0 + "]", c1.toString());
    }
}