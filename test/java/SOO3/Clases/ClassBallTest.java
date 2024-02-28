package SOO3.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassBallTest {

    @Test
    void getX() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(1.1f, b1.getX());
    }

    @Test
    void setX() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.setX(80.f);
        assertEquals(80.0f, b1.getX());
    }

    @Test
    void getY() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(2.2f, b1.getY());
    }

    @Test
    void setY() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.setY(35.0f);
        assertEquals(35.0f, b1.getY());
    }

    @Test
    void getRadius() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(10, b1.getRadius());
    }

    @Test
    void setRadius() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.setRadius(5);
        assertEquals(5, b1.getRadius());
    }

    @Test
    void getXDelta() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(3.3f, b1.getXDelta());
    }

    @Test
    void setXDelta() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.setXDelta(4.0f);
        assertEquals(4.0f, b1.getXDelta());
    }

    @Test
    void getYDelta() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(4.4f, b1.getYDelta());
    }

    @Test
    void setYDelta() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.setYDelta(6.0f);
        assertEquals(6.0f, b1.getYDelta());
    }

    @Test
    void move() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.move();
        assertEquals(4.4f, b1.getX(), 0.01d);
        assertEquals(6.6f, b1.getY(), 0.01d);
    }

    @Test
    void reflectHorizontal() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.reflectHorizontal();
        assertEquals(-3.3, b1.getXDelta(),0.01d);
    }

    @Test
    void reflectVertical() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.reflectVertical();
        assertEquals(-4.4, b1.getYDelta(),0.01d);
    }

    @Test
    void testToString() {
        ClassBall b1 = new ClassBall(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals("Ball[(x" + 1.1f+ ",y)" + 2.2f + ",speed = (" + 3.3f + "," + 4.4f + ")]", b1.toString());
    }
}