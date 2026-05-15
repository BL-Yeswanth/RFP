import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddressBook addressBook =
                new AddressBook();

        System.out.println(
                "Welcome to Address Book Program"
        );

        // Add Multiple Contacts
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
                    "\nContact Added Successfully"
            );

            // Ask User to Continue
            System.out.println(
                    "\nDo you want to add another contact? (yes/no)"
            );

            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("no")) {

                break;
            }
        }

        // Display All Contacts
        System.out.println(
                "\nAll Contact Details:"
        );

        addressBook.displayContacts();

        sc.close();
    }
}