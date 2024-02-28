package SOO4.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import SOO4.Clases.MyPoint;

class MyCircleTest {

    @Test
    void getRadius() {
        MyPoint centro1 = new MyPoint(1, 2);
        MyPoint centro2 = new MyPoint(0, 0);
        MyCircle circle1 = new MyCircle(centro2, 1);
        assertEquals(1, circle1.getRadius());
    }

    @Test
    void setRadius() {
    }

    @Test
    void getCenter() {
    }

    @Test
    void setCenter() {
    }

    @Test
    void getCenterX() {
    }

    @Test
    void setCenterX() {
    }

    @Test
    void getCenterY() {
    }

    @Test
    void setCenterY() {
    }

    @Test
    void getCenterXY() {
    }

    @Test
    void setCenterXY() {
    }

    @Test
    void testToString() {
    }

    @Test
    void getArea() {
    }

    @Test
    void getCircumference() {
    }

    @Test
    void distance() {
    }
}