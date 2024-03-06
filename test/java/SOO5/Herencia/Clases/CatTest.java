package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void testToString() {
        Mammal m1 = new Mammal("Lúa");
        Cat c1 = new Cat("Lúa");
        assertEquals("Cat [" + m1 + "]", c1.toString());
    }
    @Test
    void greets() {
        Mammal m1 = new Mammal("Lúa");
        Cat c1 = new Cat("Lúa");
        c1.greets();
    }
}