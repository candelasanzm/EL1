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
        Movable2 m2 = new MovableCircle(2, 1, 1, 4, 1);
        assertEquals(-3, m2.moveUp());
    }

    @Test
    void moveDown() {
        Movable2 m2 = new MovableCircle(2, 1, 1, 4, 1);
        assertEquals(5, m2.moveDown());
    }

    @Test
    void moveLeft() {
        Movable2 m2 = new MovableCircle(2, 1, 1, 4, 1);
        assertEquals(1, m2.moveLeft());
    }

    @Test
    void moveRigth() {
        Movable2 m2 = new MovableCircle(2, 1, 1, 4, 1);
        assertEquals(3, m2.moveRigth());
    }
}