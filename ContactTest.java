package jupiter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import testing.Contact;

class ContactTest {

    @Test
    void testContact() {
        Contact contactClass = new Contact("1", "1", "1", "1", "1");
        assertEquals("1", contactClass.getFirstName());
        assertEquals("1", contactClass.getLastName());
        assertEquals("1", contactClass.getAddress());
        assertEquals("1", contactClass.getPhoneNumber());
        assertEquals("1", contactClass.getContactID());
    }

    @Test
    void errorWithConstructor() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567891011", "Jerome", "New Task 1", "1", "1");
        });
    }
}
