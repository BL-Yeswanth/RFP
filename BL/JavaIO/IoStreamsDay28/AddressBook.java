import java.util.ArrayList;

public class AddressBook {

    // Collection To Store Contacts
    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(
            Contact contact) {

        contactList.add(contact);
    }

    // Get Contact List
    public ArrayList<Contact> getContacts() {

        return contactList;
    }
}