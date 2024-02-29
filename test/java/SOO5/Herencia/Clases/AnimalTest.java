package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Animal a1 = new Animal("Lúa");
        assertEquals("Animal [ name = " + "Lúa" + "]", a1.toString());
    }
}