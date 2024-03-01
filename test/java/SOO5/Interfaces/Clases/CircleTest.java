package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1 = new Circle(5.5);
        assertEquals(5.5, c1.getRadius());
    }

    @Test
    void setRadius() {
        Circle c1 = new Circle();
        c1.setRadius(5.5);
        assertEquals(5.5, c1.getRadius());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle(5.5);
        assertEquals(Math.PI*Math.pow(5.5,2), c1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle(5.5);
        assertEquals(Math.PI*5.5*2, c1.getPerimeter());
    }

    @Test
    void testToString() {
        Shape s1 = new Circle("red", false, 5.5);
        Circle c1 = (Circle) s1;
        assertEquals(s1, c1.toString());
    }
}