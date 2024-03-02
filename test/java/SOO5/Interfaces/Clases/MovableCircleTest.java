package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        Movable2 m1 = new MovablePoint2(2, 1, 1, 4);
        Movable2 m2 = new MovableCircle(2, 1, 1, 4, 1);
        assertEquals(m1 + ", radius = " + 1, m2.toString());
    }

    @Test
    void moveUp() {
        MovableCircle m1 = new MovableCircle(2, 1, 1, 4, 1);
        m1.moveUp();
        assertEquals(2, m1.x);
        assertEquals(-3, m1.y);
    }

    @Test
    void moveDown() {
        MovableCircle m1 = new MovableCircle(2, 1, 1, 4, 1);
        m1.moveDown();
        assertEquals(2, m1.x);
        assertEquals(5, m1.y);
    }

    @Test
    void moveLeft() {
        MovableCircle m1 = new MovableCircle(2, 1, 1, 4, 1);
        m1.moveLeft();
        assertEquals(1, m1.x);
        assertEquals(1, m1.y);
    }

    @Test
    void moveRigth() {
        MovableCircle m1 = new MovableCircle(2, 1, 1, 4, 1);
        m1.moveRigth();
        assertEquals(3, m1.x);
        assertEquals(1, m1.y);
    }
}