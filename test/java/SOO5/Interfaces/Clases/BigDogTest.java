package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        BigDog d1 = new BigDog("Thor");
        d1.greets();
    }

    @Test
    void testGreets() {
        Dog d2 = new BigDog("Ona");
        d2.greets(d2);
    }

    @Test
    void testGreets1() {
        BigDog d3 = new BigDog("Rocky");
        d3.greets(d3);
    }
}