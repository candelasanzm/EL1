package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        Animal a1 = new Animal("Lúa");
        Mammal m1 = new Mammal("Lúa");
        assertEquals("Mammal [ " + a1 + "]", m1.toString());
    }
}