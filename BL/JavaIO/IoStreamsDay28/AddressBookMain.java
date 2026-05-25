import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome To Address Book Program"
        );

        Scanner scanner =
                new Scanner(System.in);

        // Create AddressBook Object
        AddressBook addressBook =
                new AddressBook();

        // Read Contact Details From Console
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

        // Add Contact To AddressBook
        addressBook.addContact(person);

        // Display Contacts
        addressBook.displayContacts();

        scanner.close();
    }
}