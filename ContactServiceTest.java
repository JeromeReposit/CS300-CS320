package jupiter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import testing.Contact;
import testing.ContactService;

import org.junit.jupiter.api.BeforeEach;
class ContactServiceTest {
private ContactService contactservice;
	@BeforeEach
	public void before() {
		contactservice = new ContactService();
	}
	// adding contact
	@Test
	public void testContact() {
		Contact p1 = new Contact("id1","firstname","lastname","num","add");
		contactservice.addContact(p1);
		assertEquals(p1, contactservice.getContact("id1"));
	}
	//delete contact
	@Test
	public void deleteContact() {
		Contact p1 = new Contact("id1","firstname","lastname","num","add");
		contactservice.addContact(p1);
		contactservice.deleteContact("id1");
		assertNull(contactservice.getContact("id1"));
	}
	// update firstName
	@Test
	public void testUpdateFirstName() {
		Contact p1 = new Contact("id1","firstname","lastname","num","add");
		contactservice.addContact(p1);
		contactservice.updateFirstName("id1", "fn");
		assertEquals("fn", contactservice.getContact("id1").getFirstName());
	}
	// update lastName
		@Test
		public void testUpdateLastName() {
			Contact p1 = new Contact("id1","firstname","lastname","num","add");
			contactservice.addContact(p1);
			contactservice.updateLastName("id1", "ln");
			assertEquals("ln", contactservice.getContact("id1").getLastName());
		}
	// update number
		@Test
		public void testUpdateNumbere() {
			Contact p1 = new Contact("id1","firstname","lastname","num","add");
			contactservice.addContact(p1);
			contactservice.updateNumber("id1", "num1");
			assertEquals("num1", contactservice.getContact("id1").getPhoneNumber());
	}
		// update address
		@Test
		public void testUpdateAddress() {
			Contact p1 = new Contact("id1","firstname","lastname","num","add");
			contactservice.addContact(p1);
			contactservice.updateAddress("id1", "add1");
			assertEquals("add1", contactservice.getContact("id1").getAddress());
	}
}
