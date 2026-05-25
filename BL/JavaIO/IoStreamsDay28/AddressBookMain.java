import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome To Address Book Program"
        );

        Scanner scanner =
                new Scanner(System.in);

        // Dictionary Of Address Books
        Map<String, AddressBook> addressBookMap =
                new HashMap<>();

        // Create Address Book
        System.out.println(
                "\nEnter Address Book Name:"
        );

        String bookName =
                scanner.nextLine();

        AddressBook addressBook =
                new AddressBook();

        addressBookMap.put(
                bookName,
                addressBook
        );

        char choice;

        do {

            // Read Contact Details
            System.out.println(
                    "\nEnter First Name:"
            );
            String firstName =
                    scanner.nextLine();

            System.out.println(
                    "Enter Last Name:"
            );
            String lastName =
                    scanner.nextLine();

            System.out.println(
                    "Enter Address:"
            );
            String address =
                    scanner.nextLine();

            System.out.println(
                    "Enter City:"
            );
            String city =
                    scanner.nextLine();

            System.out.println(
                    "Enter State:"
            );
            String state =
                    scanner.nextLine();

            System.out.println(
                    "Enter Zip:"
            );
            String zip =
                    scanner.nextLine();

            System.out.println(
                    "Enter Phone Number:"
            );
            String phoneNumber =
                    scanner.nextLine();

            System.out.println(
                    "Enter Email:"
            );
            String email =
                    scanner.nextLine();

            // Create Contact Object
            Contact person =
                    new Contact(
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
            addressBook.addContact(person);

            // Continue Option
            System.out.println(
                    "\nDo You Want To Add Another Contact? (y/n)"
            );

            choice =
                    scanner.nextLine().charAt(0);

        } while (choice == 'y'
                || choice == 'Y');

        // Display Contacts
        System.out.println(
                "\nAll Contacts"
        );

        addressBook.displayContacts();

        scanner.close();
    }
}