package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D p2D1 = new Point2D(0, 0);
        assertEquals(0, p2D1.getX());
    }

    @Test
    void setX() {
        Point2D p2D1 = new Point2D(0, 0);
        p2D1.setX(0);
        assertEquals(0, p2D1.getX());
    }

    @Test
    void getY() {
        Point2D p2D1 = new Point2D(0, 0);
        assertEquals(0, p2D1.getY());
    }

    @Test
    void setY() {
        Point2D p2D1 = new Point2D(0, 0);
        p2D1.setY(0);
        assertEquals(0, p2D1.getY());
    }

    @Test
    void setXY() {
        Point2D p2D1 = new Point2D(0, 0);
        p2D1.setXY(0,0);
        float [] esp = new float[] {0,0};
        assertArrayEquals(esp, p2D1.getXY());
    }

    @Test
    void getXY() {
        Point2D p2D1 = new Point2D(0, 0);
        float [] esp = new float[] {0,0};
        assertArrayEquals(esp, p2D1.getXY());
    }

    @Test
    void testToString() {
        Point2D p2D1 = new Point2D(0, 0);
        assertEquals("(" + 0.0 + ", " + 0.0 + ")", p2D1.toString());
    }
}