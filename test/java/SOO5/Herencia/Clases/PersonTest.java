package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person p1 = new Person("Ana", "Calle Toledo");
        assertEquals("Ana", p1.getName());
    }

    @Test
    void getAdress() {
        Person p1 = new Person("Ana", "Calle Toledo");
        assertEquals("Calle Toledo", p1.getAdress());
    }

    @Test
    void setAdress() {
        Person p1 = new Person("Ana", "Calle Toledo");
        p1.setAdress("Calle Toledo");
        assertEquals("Calle Toledo", p1.getAdress());
    }

    @Test
    void testToString() {
        Person p1 = new Person("Ana", "Calle Toledo");
        assertEquals("Person[name = " + "Ana" + ", adress = " + "Calle Toledo" + "]", p1.toString());
    }
}