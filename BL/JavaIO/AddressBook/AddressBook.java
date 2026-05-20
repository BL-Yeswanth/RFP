import java.util.ArrayList;

public class AddressBook {

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
                    "Duplicate Contact Found"
            );

        } else {

            contactList.add(contact);

            System.out.println(
                    "Contact Added Successfully"
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