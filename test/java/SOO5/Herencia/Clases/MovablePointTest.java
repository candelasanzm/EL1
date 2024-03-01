package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getxSpeed() {
        MovablePoint p3 = new MovablePoint(2.0f,1.0f,4.0f, 3.0f);
        assertEquals(4.0, p3.getxSpeed());
    }

    @Test
    void setxSpeed() {
        MovablePoint p3 = new MovablePoint(2.0f,1.0f,4.0f, 3.0f);
        p3.setxSpeed(4.0f);
        assertEquals(4.0, p3.getxSpeed());
    }

    @Test
    void getySpeed() {
        MovablePoint p3 = new MovablePoint(2.0f,1.0f,4.0f, 3.0f);
        assertEquals(3.0, p3.getySpeed());
    }

    @Test
    void setySpeed() {
        MovablePoint p3 = new MovablePoint(2.0f,1.0f,4.0f, 3.0f);
        p3.setySpeed(3.0f);
        assertEquals(3.0, p3.getySpeed());
    }

    @Test
    void setSpeed() {
        MovablePoint p3 = new MovablePoint(2.0f,1.0f,4.0f, 3.0f);
        p3.setSpeed(4.0f, 3.0f);
        float [] esp = new float[] {4.0f, 3.0f};
        assertArrayEquals(esp, p3.getSpeed());
    }

    @Test
    void getSpeed() {
        MovablePoint p3 = new MovablePoint(2.0f,1.0f,4.0f, 3.0f);
        float [] esp = new float[] {4.0f, 3.0f};
        assertArrayEquals(esp, p3.getSpeed());
    }

    @Test
    void testToString() {
        Point2D p1 = new Point2D(0.0f,0.0f);
        MovablePoint p2 = new MovablePoint(4.0f,3.0f);
        assertEquals(p1 + ", speed = (" + 4.0 + ", " + 3.0 + ")", p2.toString());
    }

    @Test
    void move() {
        MovablePoint p4 = new MovablePoint();
        assertEquals(p4, p4.move());
    }
}