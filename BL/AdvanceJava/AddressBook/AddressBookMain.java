import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Welcome to Address Book Program"
        );

        // Enter Contact Details
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

        // Create AddressBook
        AddressBook addressBook =
                new AddressBook();

        // Add Contact
        addressBook.addContact(contact);

        // Display Contacts
        System.out.println("\nSaved Contact:");

        addressBook.displayContacts();

        // Edit Contact
        System.out.println(
                "\nEnter First Name to Edit Contact:"
        );

        String editName = sc.nextLine();

        addressBook.editContact(editName);

        // Display Updated Contact
        System.out.println(
                "\nUpdated Contact Details:"
        );

        addressBook.displayContacts();

        sc.close();
    }
}