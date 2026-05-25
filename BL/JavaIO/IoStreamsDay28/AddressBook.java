import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(
            Contact contact) {

        contactList.add(contact);

        System.out.println(
                "\nContact Added Successfully"
        );
    }

    // Delete Contact Using Name
    public void deleteContact(
            String firstName) {

        boolean found = false;

        for (int i = 0;
             i < contactList.size();
             i++) {

            if (contactList.get(i)
                    .firstName
                    .equalsIgnoreCase(firstName)) {

                contactList.remove(i);

                found = true;

                System.out.println(
                        "\nContact Deleted Successfully"
                );

                break;
            }
        }

        if (!found) {

            System.out.println(
                    "\nContact Not Found"
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