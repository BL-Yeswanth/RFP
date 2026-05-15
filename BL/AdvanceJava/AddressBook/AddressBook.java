import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(Contact contact) {

        boolean isDuplicate =
                contactList.stream()
                        .anyMatch(
                                existingContact ->
                                        existingContact.equals(contact)
                        );

        if (isDuplicate) {

            System.out.println(
                    "\nDuplicate Contact Found"
            );

            return;
        }

        contactList.add(contact);

        System.out.println(
                "\nContact Added Successfully"
        );
    }

    // Get Contacts
    public ArrayList<Contact> getContacts() {

        return contactList;
    }
}