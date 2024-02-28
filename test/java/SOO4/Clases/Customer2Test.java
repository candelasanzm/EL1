package SOO4.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Customer2Test {

    @Test
    void getId() {
        Customer2 c21 = new Customer2(88, "Tan Ah Teck", 'm');
        assertEquals(88, c21.getId());
    }

    @Test
    void getName() {
        Customer2 c21 = new Customer2(88, "Tan Ah Teck", 'm');
        assertEquals("Tan Ah Teck", c21.getName());
    }

    @Test
    void getGender() {
        Customer2 c21 = new Customer2(88, "Tan Ah Teck", 'm');
        assertEquals('m', c21.getGender());
    }

    @Test
    void testToString() {
        Customer2 c21 = new Customer2(88, "Tan Ah Teck", 'm');
        assertEquals("Tan Ah Teck" + "(" + 88 + ")", c21.toString());
    }
}