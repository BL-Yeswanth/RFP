import java.util.ArrayList;

public class AddressBook {

    // Collection To Store Contacts
    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(
            Contact contact) {

        contactList.add(contact);

        System.out.println(
                "Contact Added Successfully"
        );
    }

    // Display Contacts
    public void displayContacts() {

        for (Contact contact
                : contactList) {

            contact.displayContact();
        }
    }
}