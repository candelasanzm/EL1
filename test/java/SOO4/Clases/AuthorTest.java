package SOO4.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("Tan Ah Teck", a1.getName());
    }

    @Test
    void getEmail() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("ahteck@nowhere.com", a1.getEmail());
    }

    @Test
    void setEmail() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        a1.setEmail("ahteck@nowhere.com");
        assertEquals("ahteck@nowhere.com", a1.getEmail());
    }

    @Test
    void testToString() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("Author[name = " + "Tan Ah Teck" + ", email = " + "ahteck@nowhere.com" + "]", a1.toString());
    }
}