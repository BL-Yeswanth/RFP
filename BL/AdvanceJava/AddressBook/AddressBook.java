import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(Contact contact) {

        // Duplicate Check using Streams
        boolean isDuplicate =
                contactList.stream()
                        .anyMatch(
                                existingContact ->
                                        existingContact.equals(contact)
                        );

        if (isDuplicate) {

            System.out.println(
                    "\nDuplicate Contact Found. Contact Not Added."
            );

            return;
        }

        contactList.add(contact);

        System.out.println(
                "\nContact Added Successfully"
        );
    }

    // Display Contacts
    public void displayContacts() {

        for (Contact contact : contactList) {

            System.out.println("\n----------------");

            contact.displayContact();
        }
    }
}