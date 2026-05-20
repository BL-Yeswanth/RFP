import java.util.ArrayList;
import java.util.Comparator;

public class AddressBook {

    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(
            Contact contact) {

        contactList.add(contact);
    }

    // Sort Contacts By First Name
    public void sortContactsByName() {

        contactList.stream()
                .sorted(
                        Comparator.comparing(
                                contact -> contact.firstName
                        )
                )
                .forEach(System.out::println);
    }
}