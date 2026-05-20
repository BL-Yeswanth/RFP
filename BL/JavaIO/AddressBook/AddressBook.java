import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(
            Contact contact) {

        contactList.add(contact);
    }

    // Display Contacts
    public void displayContacts() {

        for (Contact contact
                : contactList) {

            contact.displayContact();
        }
    }
}