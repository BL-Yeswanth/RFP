import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(
            Contact contact) {

        contactList.add(contact);

        System.out.println(
                "\nContact Added Successfully"
        );
    }

    // Edit Contact Using Name
    public void editContact(
            String firstName) {

        Scanner scanner =
                new Scanner(System.in);

        boolean found = false;

        for (Contact contact
                : contactList) {

            if (contact.firstName.equalsIgnoreCase(
                    firstName)) {

                found = true;

                System.out.println(
                        "\nEnter New Address:"
                );
                contact.address =
                        scanner.nextLine();

                System.out.println(
                        "Enter New City:"
                );
                contact.city =
                        scanner.nextLine();

                System.out.println(
                        "Enter New State:"
                );
                contact.state =
                        scanner.nextLine();

                System.out.println(
                        "Enter New Zip:"
                );
                contact.zip =
                        scanner.nextLine();

                System.out.println(
                        "Enter New Phone Number:"
                );
                contact.phoneNumber =
                        scanner.nextLine();

                System.out.println(
                        "Enter New Email:"
                );
                contact.email =
                        scanner.nextLine();

                System.out.println(
                        "\nContact Edited Successfully"
                );
            }
        }

        if (!found) {

            System.out.println(
                    "\nContact Not Found"
            );
        }
    }

    // Display Contacts
    public void displayContacts() {

        for (Contact contact
                : contactList) {

            contact.displayContact();
        }
    }
}