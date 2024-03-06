package SOO3.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassTimeTest {

    @Test
    void getHour() {
        ClassTime t1 = new ClassTime(1, 2, 3);
        assertEquals(1, t1.getHour());
    }

    @Test
    void setHour() {
        ClassTime t1 = new ClassTime(1, 2, 3);
        t1.setHour(4);
        assertEquals(4, t1.getHour());
    }

    @Test
    void getMinute() {
        ClassTime t1 = new ClassTime(1, 2, 3);
        assertEquals(2, t1.getMinute());
    }

    @Test
    void setMinute() {
        ClassTime t1 = new ClassTime(1, 2, 3);
        t1.setMinute(5);
        assertEquals(5, t1.getMinute());
    }

    @Test
    void getSecond() {
        ClassTime t1 = new ClassTime(1, 2, 3);
        assertEquals(3, t1.getSecond());
    }

    @Test
    void setSecond() {
        ClassTime t1 = new ClassTime(1, 2, 3);
        t1.setSecond(6);
        assertEquals(6, t1.getSecond());
    }

    @Test
    void setTime() {
        ClassTime t1 = new ClassTime(1, 2, 3);
        t1.setTime(23, 59, 58);
        assertEquals(23, t1.getHour());
        assertEquals(59, t1.getMinute());
        assertEquals(58, t1.getSecond());
    }

    @Test
    void testToString() {
        ClassTime t1 = new ClassTime(1, 2, 3);
        assertEquals(1 + ":" + 2 + ":" + 3, t1.toString());
    }

    @Test
    void nextSecond() {
        ClassTime t1 = new ClassTime(1, 2, 3);
        ClassTime t2 = new ClassTime(1, 2, 63);
        assertEquals(t1, t1.nextSecond());
        assertEquals(t2, t2.nextSecond());
    }

    @Test
    void previousSecond() {
        ClassTime t1 = new ClassTime(1, 2, 3);
        ClassTime t2 = new ClassTime(1, 2, -2);
        assertEquals(t1, t1.previousSecond());
        assertEquals(t2, t2.previousSecond());
    }
}