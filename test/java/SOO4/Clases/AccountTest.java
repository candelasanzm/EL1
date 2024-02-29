package SOO4.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import SOO4.Clases.Customer2;

class AccountTest {

    @Test
    void getId() {
        Customer2 c21 = new Customer2(88, "Tan Ah Teck", 'm');
        Account a1 = new Account(101, c21);
        assertEquals(101, a1.getId());
    }

    @Test
    void getCustomer2() {
        Customer2 c21 = new Customer2(88, "Tan Ah Teck", 'm');
        Account a1 = new Account(101, c21, 888.8);
        assertEquals(c21, a1.getCustomer2());
    }

    @Test
    void getBalance() {
        Customer2 c21 = new Customer2(88, "Tan Ah Teck", 'm');
        Account a1 = new Account(101, c21, 888.8);
        assertEquals(888.8, a1.getBalance());
    }

    @Test
    void setBalance() {
        Customer2 c21 = new Customer2(88, "Tan Ah Teck", 'm');
        Account a1 = new Account(101, c21, 888.8);
        a1.setBalance(888.8);
        assertEquals(888.8, a1.getBalance());
    }

    @Test
    void testToString() {
        Customer2 c21 = new Customer2(88, "Tan Ah Teck", 'm');
        Account a1 = new Account(101, c21, 888.8);
        assertEquals(c21 + ", balance = $" + 888.8, a1.toString());
    }

    @Test
    void getCustomerName() {
        Customer2 c21 = new Customer2(88, "Tan Ah Teck", 'm');
        Account a1 = new Account(101, c21, 888.8);
        assertEquals("Tan Ah Teck", a1.getCustomerName());
    }

    @Test
    void deposit() {
        Customer2 c21 = new Customer2(88, "Tan Ah Teck", 'm');
        Account a1 = new Account(101, c21, 888.8);
        assertEquals(a1, a1.deposit(28));
    }

    @Test
    void withdraw() {
        Customer2 c21 = new Customer2(88, "Tan Ah Teck", 'm');
        Account a1 = new Account(101, c21, 888.8);
        Account a2 = new Account(101, c21, 888.8);
        assertEquals(a1, a1.withdraw(50),"amount widthdrawn exceeds the current balance!");
    }
}