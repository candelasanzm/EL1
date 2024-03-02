package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog d1 = new Dog("Ona");
        d1.greets();
    }

    @Test
    void testGreets() {
        Dog d2 = new Dog("Lúa");
        d2.greets(d2);
    }
}