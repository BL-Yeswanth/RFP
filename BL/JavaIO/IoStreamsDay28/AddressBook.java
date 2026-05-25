import java.util.ArrayList;

public class AddressBook {

    // Collection To Store Contacts
    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact With Duplicate Check
    public void addContact(
            Contact contact) {

        boolean isDuplicate =
                contactList.stream()
                        .anyMatch(
                                person ->
                                        person.equals(contact)
                        );

        if (isDuplicate) {

            System.out.println(
                    "\nDuplicate Contact Found"
            );

        } else {

            contactList.add(contact);

            System.out.println(
                    "\nContact Added Successfully"
            );
        }
    }

    // Display Contacts
    public void displayContacts() {

        for (Contact contact
                : contactList) {

            contact.displayContact();
        }
    }
}