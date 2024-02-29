package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog d1 = new Dog("Lúa");
        assertEquals("Woof", d1.greets());
    }

    @Test
    void testGreets() {
        Dog d1 = new Dog("Lúa");
        Dog d2 = new Dog("Oreo");
        assertEquals("Woooof", d2.greets());
    }

    @Test
    void testToString() {
        Mammal m1 = new Mammal("Lúa");
        Dog d1 = new Dog("Lúa");
        assertEquals("Dog [ " + m1 + "]", d1.toString());
    }
}