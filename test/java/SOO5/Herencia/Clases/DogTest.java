package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testToString() {
        Mammal m1 = new Mammal("Lúa");
        Dog d1 = new Dog("Lúa");
        assertEquals("Dog [ " + m1 + "]", d1.toString());
    }
}