import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Address Book Program"
        );

        Scanner scanner =
                new Scanner(System.in);

        // Multiple Address Books
        Map<String, AddressBook> addressBookMap =
                new HashMap<>();

        // First Address Book
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

        // Second Address Book
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

        // Search By City
        System.out.println(
                "\nEnter City To Search:"
        );

        String city =
                scanner.nextLine();

        System.out.println(
                "\nPersons Found In City:"
        );

        for (String bookName
                : addressBookMap.keySet()) {

            List<Contact> cityResult =
                    addressBookMap
                            .get(bookName)
                            .searchByCity(city);

            cityResult.forEach(
                    Contact::displayContact
            );
        }

        // Search By State
        System.out.println(
                "\nEnter State To Search:"
        );

        String state =
                scanner.nextLine();

        System.out.println(
                "\nPersons Found In State:"
        );

        for (String bookName
                : addressBookMap.keySet()) {

            List<Contact> stateResult =
                    addressBookMap
                            .get(bookName)
                            .searchByState(state);

            stateResult.forEach(
                    Contact::displayContact
            );
        }

        scanner.close();
    }
}