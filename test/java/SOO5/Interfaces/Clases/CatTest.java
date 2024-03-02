package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat a1 = new Cat("gato");
        a1.greets();
    }
}