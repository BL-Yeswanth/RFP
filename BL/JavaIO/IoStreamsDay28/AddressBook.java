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

    // Sort By City
    public void sortByCity() {

        System.out.println(
                "\nContacts Sorted By City"
        );

        contactList.stream()
                .sorted(
                        Comparator.comparing(
                                contact -> contact.city
                        )
                )
                .forEach(System.out::println);
    }

    // Sort By State
    public void sortByState() {

        System.out.println(
                "\nContacts Sorted By State"
        );

        contactList.stream()
                .sorted(
                        Comparator.comparing(
                                contact -> contact.state
                        )
                )
                .forEach(System.out::println);
    }

    // Sort By Zip
    public void sortByZip() {

        System.out.println(
                "\nContacts Sorted By Zip"
        );

        contactList.stream()
                .sorted(
                        Comparator.comparing(
                                contact -> contact.zip
                        )
                )
                .forEach(System.out::println);
    }
}