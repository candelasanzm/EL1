package SOO3.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaseAccountTest {

    @Test
    void getID() {
        ClaseAccount c1 = new ClaseAccount("A101", "Tan Ah Teck");
        assertEquals("A101", c1.getID());
    }

    @Test
    void getName() {
        ClaseAccount c1 = new ClaseAccount("A101", "Tan Ah Teck");
        assertEquals("Tan Ah Teck", c1.getName());
    }

    @Test
    void getBalance() {
        ClaseAccount c1 = new ClaseAccount("A101", "Tan Ah Teck", 88);
        assertEquals(88, c1.getBalance());
    }

    @Test
    void credit() {
        ClaseAccount c1 = new ClaseAccount("A101", "Tan Ah Teck", 88);
        assertEquals(88, c1.credit(100));
    }

    @Test
    void debit() {
        ClaseAccount c1 = new ClaseAccount("A101", "Tan Ah Teck", 88);
        assertEquals(88, c1.debit(50));
    }

    @Test
    void transferTo() {
        ClaseAccount c1 = new ClaseAccount("A101", "Tan Ah Teck", 88);
        ClaseAccount c2 = new ClaseAccount("A102", "Kumar", 88);
        assertEquals(88, c1.transferTo(c2, 100));
    }

    @Test
    void testToString() {
        ClaseAccount c1 = new ClaseAccount("A101", "Tan Ah Teck", 88);
        assertEquals("Account[id = " + "A101" + " name = " + "Tan Ah Teck" + "balance = " + 88 + "]", c1.toString());
    }
}