import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome To Address Book Program"
        );

        // Multiple Address Books
        Map<String, AddressBook> addressBookMap =
                new HashMap<>();

        // Address Book 1
        AddressBook familyBook =
                new AddressBook();

        familyBook.addContact(
                new Contact(
                        "Yaswanth",
                        "Polisetti",
                        "ABC Street",
                        "Chennai",
                        "Tamil Nadu",
                        "600001",
                        "9876543210",
                        "yas@gmail.com"
                )
        );

        familyBook.addContact(
                new Contact(
                        "Kiran",
                        "Kumar",
                        "XYZ Street",
                        "Hyderabad",
                        "Telangana",
                        "500001",
                        "9876501234",
                        "kiran@gmail.com"
                )
        );

        addressBookMap.put(
                "Family",
                familyBook
        );

        // Address Book 2
        AddressBook friendsBook =
                new AddressBook();

        friendsBook.addContact(
                new Contact(
                        "Rahul",
                        "Sharma",
                        "MG Road",
                        "Chennai",
                        "Tamil Nadu",
                        "600002",
                        "9988776655",
                        "rahul@gmail.com"
                )
        );

        addressBookMap.put(
                "Friends",
                friendsBook
        );

        // Dictionary Of City And Persons
        Map<String, ArrayList<Contact>> cityMap =
                new HashMap<>();

        // Dictionary Of State And Persons
        Map<String, ArrayList<Contact>> stateMap =
                new HashMap<>();

        // Store Contacts In Dictionaries
        addressBookMap.values()
                .stream()
                .flatMap(
                        addressBook ->
                                addressBook
                                        .getContacts()
                                        .stream()
                )
                .forEach(contact -> {

                    cityMap
                            .computeIfAbsent(
                                    contact.city,
                                    k -> new ArrayList<>()
                            )
                            .add(contact);

                    stateMap
                            .computeIfAbsent(
                                    contact.state,
                                    k -> new ArrayList<>()
                            )
                            .add(contact);
                });

        // View Persons By City
        System.out.println(
                "\nPersons By City"
        );

        cityMap.forEach(
                (city, persons) -> {

                    System.out.println(
                            "\nCity : "
                                    + city
                    );

                    persons.forEach(
                            Contact::displayContact
                    );
                }
        );

        // View Persons By State
        System.out.println(
                "\nPersons By State"
        );

        stateMap.forEach(
                (state, persons) -> {

                    System.out.println(
                            "\nState : "
                                    + state
                    );

                    persons.forEach(
                            Contact::displayContact
                    );
                }
        );
    }
}