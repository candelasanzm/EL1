package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void testToString() {
        Movable m1 = new MovablePoint(2, 1, 1, 4);
        assertEquals("(" + 2 + ", " + 1 + "), speed = (" + 1 + ", " + 4 + ")", m1.toString());
    }

    @Test
    void moveUp() {
        MovablePoint m1 = new MovablePoint(2, 1, 1, 4);
        m1.moveUp();
        assertEquals(2, m1.x);
        assertEquals(-3, m1.y);
    }

    @Test
    void moveDown() {
        MovablePoint m1 = new MovablePoint(2, 1, 1, 4);
        m1.moveDown();
        assertEquals(2, m1.x);
        assertEquals(5, m1.y);
    }

    @Test
    void moveLeft() {
        MovablePoint m1 = new MovablePoint(2, 1, 1, 4);
        m1.moveLeft();
        assertEquals(1, m1.x);
        assertEquals(1, m1.y);
    }

    @Test
    void moveRigth() {
        MovablePoint m1 = new MovablePoint(2, 1, 1, 4);
        m1.moveRigth();
        assertEquals(3, m1.x);
        assertEquals(1, m1.y);
    }
}