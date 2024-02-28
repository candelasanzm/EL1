package SOO3.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassDateTest {

    @Test
    void getDay() {
        ClassDate d1 = new ClassDate(1, 2, 2014);
        assertEquals(1, d1.getDay());
    }

    @Test
    void setDay() {
        ClassDate d1 = new ClassDate(1, 2, 2014);
        d1.setDay(9);
        assertEquals(9, d1.getDay());
    }

    @Test
    void getMonth() {
        ClassDate d1 = new ClassDate(1, 2, 2014);
        assertEquals(2, d1.getMonth());
    }

    @Test
    void setMonth() {
        ClassDate d1 = new ClassDate(1, 2, 2014);
        d1.setMonth(12);
        assertEquals(12, d1.getMonth());
    }

    @Test
    void getYear() {
        ClassDate d1 = new ClassDate(1, 2, 2014);
        assertEquals(2014, d1.getYear());
    }

    @Test
    void setYear() {
        ClassDate d1 = new ClassDate(1, 2, 2014);
        d1.setYear(2099);
        assertEquals(2099, d1.getYear());
    }

    @Test
    void setDate() {
        ClassDate d1 = new ClassDate(1, 2, 2014);
        d1.setDate(3, 4, 2016);
        assertEquals(3, d1.getDay());
        assertEquals(4, d1.getMonth());
        assertEquals(2016, d1.getYear());
    }

    @Test
    void testToString() {
        ClassDate d1 = new ClassDate(1, 2, 2014);
        assertEquals(1 + "/" + 2 + "/" + 2014 , d1.toString());
    }
}