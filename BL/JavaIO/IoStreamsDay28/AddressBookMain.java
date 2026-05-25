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

        char choice;

        do {

            // Create Address Book
            System.out.println(
                    "\nEnter Address Book Name:"
            );

            String bookName =
                    scanner.nextLine();

            AddressBook addressBook =
                    new AddressBook();

            // Add Address Book To Dictionary
            addressBookMap.put(
                    bookName,
                    addressBook
            );

            System.out.println(
                    "Address Book Created Successfully"
            );

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

            // Create Contact
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

            // Add Contact To Address Book
            addressBook.addContact(person);

            // Continue Option
            System.out.println(
                    "\nDo You Want To Add Another Address Book? (y/n)"
            );

            choice =
                    scanner.nextLine().charAt(0);

        } while (choice == 'y'
                || choice == 'Y');

        // Display All Address Books
        System.out.println(
                "\nAll Address Books"
        );

        for (String bookName
                : addressBookMap.keySet()) {

            System.out.println(
                    "\nAddress Book Name : "
                            + bookName
            );

            addressBookMap
                    .get(bookName)
                    .displayContacts();
        }

        scanner.close();
    }
}