import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dictionary for Address Books
        Map<String, AddressBook> addressBookMap =
                new HashMap<>();

        System.out.println(
                "Welcome to Address Book Program"
        );

        while (true) {

            // Create Address Book
            System.out.println(
                    "\nEnter Address Book Name:"
            );

            String bookName = sc.nextLine();

            AddressBook addressBook =
                    new AddressBook();

            while (true) {

                // Read Contact Details
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

                // Create Contact Object
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

                // Continue Adding Contacts
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

            // Continue Adding Address Books
            System.out.println(
                    "\nAdd Another Address Book? (yes/no)"
            );

            String option = sc.nextLine();

            if (option.equalsIgnoreCase("no")) {

                break;
            }
        }

        // Display All Address Books
        System.out.println(
                "\nAll Address Books:"
        );

        for (String bookName : addressBookMap.keySet()) {

            System.out.println(
                    "\nAddress Book : " + bookName
            );

            addressBookMap
                    .get(bookName)
                    .displayContacts();
        }

        sc.close();
    }
}