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

        // Add Contacts
        Contact person1 =
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

        Contact person2 =
                new Contact(
                        "Kiran",
                        "Kumar",
                        "XYZ Street",
                        "Hyderabad",
                        "Telangana",
                        "500001",
                        "9876501234",
                        "kiran@gmail.com"
                );

        addressBook.addContact(person1);
        addressBook.addContact(person2);

        // Display Before Delete
        System.out.println(
                "\nBefore Delete:"
        );

        addressBook.displayContacts();

        // Delete Contact
        System.out.println(
                "\nEnter First Name To Delete:"
        );

        String name =
                scanner.nextLine();

        addressBook.deleteContact(name);

        // Display After Delete
        System.out.println(
                "\nAfter Delete:"
        );

        addressBook.displayContacts();

        scanner.close();
    }
}