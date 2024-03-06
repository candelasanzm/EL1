package SOO4.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import SOO4.Clases.MyPoint;

class MyCircleTest {

    @Test
    void getRadius() {
        MyPoint centro2 = new MyPoint(0, 0);
        MyCircle circle2 = new MyCircle(centro2, 1);
        assertEquals(1, circle2.getRadius());
    }

    @Test
    void setRadius() {
        MyPoint centro2 = new MyPoint(0, 0);
        MyCircle circle2 = new MyCircle(centro2, 1);
        circle2.setRadius(1);
        assertEquals(1, circle2.getRadius());
    }

    @Test
    void getCenter() {
        MyPoint centro2 = new MyPoint(0, 0);
        MyCircle circle2 = new MyCircle(0,0, 1);
        assertEquals(centro2, circle2.getCenter());
    }

    @Test
    void setCenter() {
        MyPoint centro2 = new MyPoint(0, 0);
        MyCircle circle2 = new MyCircle();
        circle2.setCenter(centro2);
        assertEquals(centro2, circle2.getCenter());
    }

    @Test
    void getCenterX() {
        MyPoint centro1 = new MyPoint(1, 2);
        MyCircle circle1 = new MyCircle(centro1, 1);
        assertEquals(1, circle1.getCenterX());
    }

    @Test
    void setCenterX() {
        MyPoint centro1 = new MyPoint(1, 2);
        MyCircle circle1 = new MyCircle(centro1, 1);
        circle1.setCenterX(1);
        assertEquals(1, circle1.getCenterX());
    }

    @Test
    void getCenterY() {
        MyPoint centro1 = new MyPoint(1, 2);
        MyCircle circle1 = new MyCircle(centro1, 1);
        assertEquals(2, circle1.getCenterY());
    }

    @Test
    void setCenterY() {
        MyPoint centro1 = new MyPoint(1, 2);
        MyCircle circle1 = new MyCircle(centro1, 1);
        circle1.setCenterY(2);
        assertEquals(2, circle1.getCenterY());
    }

    @Test
    void getCenterXY() {
        MyPoint centro1 = new MyPoint(1, 2);
        MyCircle circle1 = new MyCircle(centro1, 1);
        int [] center1 = new int [] {1, 2};
        assertArrayEquals(center1, circle1.getCenterXY());
    }

    @Test
    void setCenterXY() {
        MyPoint centro1 = new MyPoint(1, 2);
        MyCircle circle1 = new MyCircle(centro1, 1);
        circle1.setCenterXY(1,2);
        int [] center1 = new int [] {1, 2};
        assertArrayEquals(center1, circle1.getCenterXY());
    }

    @Test
    void testToString() {
        MyPoint centro2 = new MyPoint(0, 0);
        MyCircle circle2 = new MyCircle(centro2, 1);
        assertEquals("MyCircle[radius = " + 1 + ", center = " + centro2 + "]", circle2.toString());
    }

    @Test
    void getArea() {
        MyPoint centro2 = new MyPoint(0, 0);
        MyCircle circle2 = new MyCircle(centro2, 1);
        assertEquals(Math.PI, circle2.getArea());
    }

    @Test
    void getCircumference() {
        MyPoint centro2 = new MyPoint(0, 0);
        MyCircle circle2 = new MyCircle(centro2, 1);
        assertEquals(2*Math.PI, circle2.getCircumference());
    }

    @Test
    void distance() {
        MyPoint centro1 = new MyPoint(1, 2);
        MyPoint centro2 = new MyPoint(0, 0);
        MyCircle c1 = new MyCircle(centro2, 1);
        MyCircle c2 = new MyCircle(centro1, 1);
        assertEquals(Math.sqrt(5), c1.distance(c2));
    }
}