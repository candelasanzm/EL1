package SOO3.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals("A101", i1.getId());
    }

    @Test
    void getDesc() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals("Pen Red", i1.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals(888, i1.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        i1.setQty(999);
        assertEquals(999, i1.getQty());
    }

    @Test
    void getUnitPrice() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals(0.08, i1.getUnitPrice());
    }

    @Test
    void setUnitPrice() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        i1.setUnitPrice(0.99);
        assertEquals(0.99, i1.getUnitPrice());
    }

    @Test
    void getTotal() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals(71.04, i1.getTotal());
    }

    @Test
    void testToString() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals("InvoiceItem[id = " + "A101" + ", desc = " + "Pen Red" + ", qty = " + 888 + ", unitPrice = " + 0.08 + "]", i1.toString());
    }
}