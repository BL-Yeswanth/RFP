import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Multiple Address Books
        Map<String, AddressBook> addressBookMap =
                new HashMap<>();

        System.out.println(
                "Welcome to Address Book Program"
        );

        // Create Address Books
        while (true) {

            System.out.println(
                    "\nEnter Address Book Name:"
            );

            String bookName = sc.nextLine();

            AddressBook addressBook =
                    new AddressBook();

            // Add Contacts
            while (true) {

                System.out.println("\nEnter First Name:");
                String firstName = sc.nextLine();

                System.out.println("Enter Last Name:");
                String lastName = sc.nextLine();

                System.out.println("Enter Address:");
                String address = sc.nextLine();

                System.out.println("Enter City:");
                String city = sc.nextLine();

                System.out.println("Enter State:");
                String state = sc.nextLine();

                System.out.println("Enter Zip:");
                String zip = sc.nextLine();

                System.out.println("Enter Phone Number:");
                String phoneNumber = sc.nextLine();

                System.out.println("Enter Email:");
                String email = sc.nextLine();

                // Create Contact
                Contact contact = new Contact(
                        firstName,
                        lastName,
                        address,
                        city,
                        state,
                        zip,
                        phoneNumber,
                        email
                );

                // Add Contact
                addressBook.addContact(contact);

                System.out.println(
                        "\nAdd Another Contact? (yes/no)"
                );

                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("no")) {

                    break;
                }
            }

            // Store Address Book
            addressBookMap.put(
                    bookName,
                    addressBook
            );

            System.out.println(
                    "\nAdd Another Address Book? (yes/no)"
            );

            String option = sc.nextLine();

            if (option.equalsIgnoreCase("no")) {

                break;
            }
        }

        // Search by City
        System.out.println(
                "\nEnter City Name to Search:"
        );

        String searchCity = sc.nextLine();

        System.out.println(
                "\nPersons Found in City:"
        );

        addressBookMap.values()
                .stream()
                .flatMap(
                        book -> book.getContacts().stream()
                )
                .filter(
                        contact ->
                                contact.city.equalsIgnoreCase(searchCity)
                )
                .forEach(
                        Contact::displayContact
                );

        // Search by State
        System.out.println(
                "\nEnter State Name to Search:"
        );

        String searchState = sc.nextLine();

        System.out.println(
                "\nPersons Found in State:"
        );

        addressBookMap.values()
                .stream()
                .flatMap(
                        book -> book.getContacts().stream()
                )
                .filter(
                        contact ->
                                contact.state.equalsIgnoreCase(searchState)
                )
                .forEach(
                        Contact::displayContact
                );

        sc.close();
    }
}