package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePoint2Test {

    @Test
    void testToString() {
        Movable2 m1 = new MovablePoint2(2, 1, 1, 4);
        assertEquals("(" + 2 + ", " + 1 + "), speed = (" + 1 + ", " + 4 + ")", m1.toString());
    }

    @Test
    void moveUp() {
        Movable2 m1 = new MovablePoint2(2, 1, 1, 4);
        assertEquals(-3, m1.moveUp());
    }

    @Test
    void moveDown() {
        Movable2 m1 = new MovablePoint2(2, 1, 1, 4);
        assertEquals(5, m1.moveDown());
    }

    @Test
    void moveLeft() {
        Movable2 m1 = new MovablePoint2(2, 1, 1, 4);
        assertEquals(1, m1.moveLeft());
    }

    @Test
    void moveRigth() {
        Movable2 m1 = new MovablePoint2(2, 1, 1, 4);
        assertEquals(3, m1.moveRigth());
    }
}