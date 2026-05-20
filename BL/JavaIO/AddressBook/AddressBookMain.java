import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Address Book Program"
        );

        Scanner scanner =
                new Scanner(System.in);

        AddressBook addressBook =
                new AddressBook();

        // Add Contact
        Contact person =
                new Contact(
                        "Yaswanth",
                        "Polisetti",
                        "ABC Street",
                        "Chennai",
                        "Tamil Nadu",
                        "600001",
                        "9876543210",
                        "yaswanth@gmail.com"
                );

        addressBook.addContact(person);

        // Display Before Edit
        System.out.println(
                "\nBefore Editing:"
        );

        addressBook.displayContacts();

        // Edit Contact
        System.out.println(
                "\nEnter First Name To Edit:"
        );

        String name =
                scanner.nextLine();

        addressBook.editContact(name);

        // Display After Edit
        System.out.println(
                "\nAfter Editing:"
        );

        addressBook.displayContacts();

        scanner.close();
    }
}