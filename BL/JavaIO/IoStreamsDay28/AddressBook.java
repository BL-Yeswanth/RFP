import java.util.ArrayList;
import java.util.Comparator;

public class AddressBook {

    // Collection To Store Contacts
    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(
            Contact contact) {

        contactList.add(contact);
    }

    // Sort Contacts By Name
    public void sortByName() {

        contactList.stream()
                .sorted(
                        Comparator.comparing(
                                contact -> contact.firstName
                        )
                )
                .forEach(System.out::println);
    }
}