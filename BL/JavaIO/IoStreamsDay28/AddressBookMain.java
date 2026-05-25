import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome To Address Book Program"
        );

        // Dictionary Of Address Books
        Map<String, AddressBook> addressBookMap =
                new HashMap<>();

        // Family Address Book
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

        // Friends Address Book
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

        friendsBook.addContact(
                new Contact(
                        "Arun",
                        "Reddy",
                        "Anna Nagar",
                        "Hyderabad",
                        "Telangana",
                        "500002",
                        "9871234567",
                        "arun@gmail.com"
                )
        );

        addressBookMap.put(
                "Friends",
                friendsBook
        );

        // Count By City
        Map<String, Long> cityCount =
                addressBookMap.values()
                        .stream()
                        .flatMap(
                                addressBook ->
                                        addressBook
                                                .getContacts()
                                                .stream()
                        )
                        .collect(
                                Collectors.groupingBy(
                                        contact -> contact.city,
                                        Collectors.counting()
                                )
                        );

        // Count By State
        Map<String, Long> stateCount =
                addressBookMap.values()
                        .stream()
                        .flatMap(
                                addressBook ->
                                        addressBook
                                                .getContacts()
                                                .stream()
                        )
                        .collect(
                                Collectors.groupingBy(
                                        contact -> contact.state,
                                        Collectors.counting()
                                )
                        );

        // Display Count By City
        System.out.println(
                "\nCount By City"
        );

        cityCount.forEach(
                (city, count) ->

                        System.out.println(
                                city
                                        + " : "
                                        + count
                        )
        );

        // Display Count By State
        System.out.println(
                "\nCount By State"
        );

        stateCount.forEach(
                (state, count) ->

                        System.out.println(
                                state
                                        + " : "
                                        + count
                        )
        );
    }
}