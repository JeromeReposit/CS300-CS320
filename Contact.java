package testing;

public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
        validate(contactID, 10, "Contact ID");
        validate(firstName, 10, "First Name");
        validate(lastName, 10, "Last Name");
        validate(phoneNumber, 10, "Phone Number");
        validate(address, 30, "Address");

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    private void validate(String field, int maxLength, String fieldName) {
        if (field == null || field.length() > maxLength) {
            throw new IllegalArgumentException("Invalid " + fieldName);
        }
    }

    public String getContactID() { return contactID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }

    public void setFirstName(String firstName) {
        validate(firstName, 10, "First Name");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        validate(lastName, 10, "Last Name");
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        validate(phoneNumber, 10, "Phone Number");
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        validate(address, 30, "Address");
        this.address = address;
    }
}
