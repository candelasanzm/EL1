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
    @Test
    void greets() {
        Mammal m1 = new Mammal("Lúa");
        Dog d1 = new Dog("Lúa");
        d1.greets();
    }
    @Test
    void testGreets() {
        Mammal m1 = new Mammal("Lúa");
        Dog d2 = new Dog("Thor");
        d2.greets(d2);
    }
}