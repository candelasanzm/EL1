package SOO3.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        assertEquals(8, e1.getId());
    }

    @Test
    void getFirstName() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        assertEquals("Peter", e1.getFirstName());
    }

    @Test
    void getLastName() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        assertEquals("Tan", e1.getLastName());
    }

    @Test
    void getName() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        assertEquals("Peter", e1.getFirstName());
        assertEquals("Tan", e1.getLastName());
    }

    @Test
    void getSalary() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        assertEquals(2500, e1.getSalary());
    }

    @Test
    void setSalary() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        e1.setSalary(2500);
        assertEquals(2500, e1.getSalary());
    }

    @Test
    void getAnnualSalary() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        assertEquals(12*2500, e1.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        assertEquals(((10*2500)/100)+2500, e1.raiseSalary(10));
    }

    @Test
    void testToString() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        assertEquals("Employee[id = " + 8 + ", name = " + "Peter" + "Tan" + ", salary = " + 2500 + "]", e1.toString());
    }
}