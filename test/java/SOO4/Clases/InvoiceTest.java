package SOO4.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import SOO4.Clases.Customer;

class InvoiceTest {

    @Test
    void getId() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals(101, inv1.getId());
    }

    @Test
    void getCustomer() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals(c1, inv1.getCustomer());
    }

    @Test
    void getAmount() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals(888.8, inv1.getAmount());
    }

    @Test
    void setAmount() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        inv1.setAmount(888.8);
        assertEquals(888.8, inv1.getAmount());
    }

    @Test
    void getCustomerId() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals(88, inv1.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals("Tan Ah Teck", inv1.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 8);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals(8, inv1.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals(888.8 - (888.8*0.08), inv1.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals("Invoice[id = " + 101 + ", " + c1 + ", amount = " + 888.8 + "]", inv1.toString());
    }
}