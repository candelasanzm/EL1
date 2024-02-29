package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student s1 = new Student("Ana", "Calle Toledo", "Informática", 3, 500);
        assertEquals("Informática", s1.getProgram());
    }

    @Test
    void setProgram() {
        Student s1 = new Student("Ana", "Calle Toledo", "Informática", 3, 500);
        s1.setProgram("Informática");
        assertEquals("Informática", s1.getProgram());
    }

    @Test
    void getYear() {
        Student s1 = new Student("Ana", "Calle Toledo", "Informática", 3, 500);
        assertEquals(3, s1.getYear());
    }

    @Test
    void setYear() {
        Student s1 = new Student("Ana", "Calle Toledo", "Informática", 3, 500);
        s1.setYear(3);
        assertEquals(3, s1.getYear());
    }

    @Test
    void getFee() {
        Student s1 = new Student("Ana", "Calle Toledo", "Informática", 3, 500);
        assertEquals(500, s1.getFee());
    }

    @Test
    void setFee() {
        Student s1 = new Student("Ana", "Calle Toledo", "Informática", 3, 500);
        s1.setFee(500);
        assertEquals(500, s1.getFee());
    }

    @Test
    void testToString() {
        Person p1 = new Person("Ana", "Calle Toledo");
        Student s1 = new Student("Ana", "Calle Toledo", "Informática", 3, 500);
        assertEquals("Student [" + p1 + "], program = " + "Informática" + ", year = " + 3 + ", fee = " + 500.0 + "]", s1.toString());
    }
}