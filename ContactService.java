package testing;
import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private Map<String, Contact> contacts = new HashMap<>();
	
	public void addContact(Contact contact) {
		if (contacts.containsKey(contact.getContactID())) {
			throw new IllegalArgumentException("Requires ID");
		}
		contacts.put(contact.getContactID(), contact);
	}
	public void deleteContact(String contactID) {
		if (!contacts.containsKey(contactID)) {
			throw new IllegalArgumentException("Need Valid ID");
		}
		contacts.remove(contactID);
	}
	public void updateFirstName(String contactID, String newfirstName) {
		Contact contact = contacts.get(contactID);
		if (contact == null) {
			throw new IllegalArgumentException("ID not valid");
		}
		contact.setFirstName(newfirstName);
	}
	public void updateLastName(String contactID, String newLastName) {
		Contact contact = contacts.get(contactID);
		if (contact == null) {
			throw new IllegalArgumentException("ID not valid");
		}
		contact.setLastName(newLastName);
	}
	public void updateNumber(String contactID, String newPhone) {
		Contact contact = contacts.get(contactID);
		if (contact == null) {
			throw new IllegalArgumentException("ID not valid");
		}
		contact.setPhoneNumber(newPhone);
	}
	public void updateAddress(String contactID, String newAddress) {
		Contact contact = contacts.get(contactID);
		if (contact == null) {
			throw new IllegalArgumentException("ID not valid");
		}
		contact.setAddress(newAddress);
	}
	public Contact getContact(String contactID) {
		return contacts.get(contactID);
	}

}
