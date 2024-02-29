package SOO4.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint p1 = new MyPoint(3, 4);
        assertEquals(3, p1.getX());
    }

    @Test
    void setX() {
        MyPoint p1 = new MyPoint(3,4);
        p1.setX(8);
        assertEquals(8, p1.getX());
    }

    @Test
    void getY() {
        MyPoint p1 = new MyPoint(3,4);
        assertEquals(4, p1.getY());
    }

    @Test
    void setY() {
        MyPoint p1 = new MyPoint(3,4);
        p1.setY(6);
        assertEquals(6, p1.getY());
    }

    @Test
    void getXY() {
        MyPoint p1 = new MyPoint(3,4);
        assertEquals(3, p1.getX());
        assertEquals(4, p1.getY());
    }

    @Test
    void setXY() {
        MyPoint p1 = new MyPoint(3,4);
        p1.setX(3);
        assertEquals(3, p1.getX());
        p1.setY(0);
        assertEquals(0, p1.getY());
    }

    @Test
    void testToString() {
        MyPoint p1 = new MyPoint(3,4);
        assertEquals("(" + 3 + ", " + 4 + ")", p1.toString());
    }

    @Test
    void distance() {
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(0, 4);
        assertEquals(3, p1.distance(p2));
    }

    @Test
    void testDistance() {
        MyPoint p1 = new MyPoint(3, 4);
        assertEquals(3, p1.distance(0,4));
    }

    @Test
    void testDistance1() {
        MyPoint p1 = new MyPoint();
        assertEquals(0, p1.distance());
    }
}