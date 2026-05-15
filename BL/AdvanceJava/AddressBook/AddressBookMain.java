import java.util.*;
import java.util.stream.Collectors;

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

        // Dictionary for City and Persons
        Map<String, List<Contact>> cityMap =
                addressBookMap.values()
                        .stream()
                        .flatMap(
                                book ->
                                        book.getContacts().stream()
                        )
                        .collect(
                                Collectors.groupingBy(
                                        contact -> contact.city
                                )
                        );

        // Dictionary for State and Persons
        Map<String, List<Contact>> stateMap =
                addressBookMap.values()
                        .stream()
                        .flatMap(
                                book ->
                                        book.getContacts().stream()
                        )
                        .collect(
                                Collectors.groupingBy(
                                        contact -> contact.state
                                )
                        );

        // View Persons by City
        System.out.println(
                "\nPersons By City:"
        );

        cityMap.forEach(
                (city, contacts) -> {

                    System.out.println(
                            "\nCity : " + city
                    );

                    contacts.forEach(
                            Contact::displayContact
                    );
                }
        );

        // View Persons by State
        System.out.println(
                "\nPersons By State:"
        );

        stateMap.forEach(
                (state, contacts) -> {

                    System.out.println(
                            "\nState : " + state
                    );

                    contacts.forEach(
                            Contact::displayContact
                    );
                }
        );

        sc.close();
    }
}