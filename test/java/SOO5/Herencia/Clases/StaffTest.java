package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff st1 = new Staff("Ana", "Calle Toledo", "Alto Jarama", 200);
        assertEquals("Alto Jarama", st1.getSchool());
    }

    @Test
    void setSchool() {
        Staff st1 = new Staff("Ana", "Calle Toledo", "Alto Jarama", 200);
        st1.setSchool("Alto Jarama");
        assertEquals("Alto Jarama", st1.getSchool());
    }

    @Test
    void getPay() {
        Staff st1 = new Staff("Ana", "Calle Toledo", "Alto Jarama", 200);
        assertEquals(200, st1.getPay());
    }

    @Test
    void setPay() {
        Staff st1 = new Staff("Ana", "Calle Toledo", "Alto Jarama", 200);
        st1.setPay(200);
        assertEquals(200, st1.getPay());
    }

    @Test
    void testToString() {
        Person p1 = new Person("Ana", "Calle Toledo");
        Staff st1 = new Staff("Ana", "Calle Toledo", "Alto Jarama", 200);
        assertEquals("Staff [" + p1 + "], school = " + "Alto Jarama" + ", pay = " + 200.0 + "]", st1.toString());
    }
}