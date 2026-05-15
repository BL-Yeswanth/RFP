import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(Contact contact) {

        contactList.add(contact);
    }

    // Edit Contact
    public void editContact(String name) {

        Scanner sc = new Scanner(System.in);

        for (Contact contact : contactList) {

            if (contact.firstName.equalsIgnoreCase(name)) {

                System.out.println("\nEnter New Address:");
                contact.address = sc.nextLine();

                System.out.println("Enter New City:");
                contact.city = sc.nextLine();

                System.out.println("Enter New State:");
                contact.state = sc.nextLine();

                System.out.println("Enter New Zip:");
                contact.zip = sc.nextLine();

                System.out.println("Enter New Phone Number:");
                contact.phoneNumber = sc.nextLine();

                System.out.println("Enter New Email:");
                contact.email = sc.nextLine();

                System.out.println(
                        "\nContact Updated Successfully"
                );

                return;
            }
        }

        System.out.println("Contact Not Found");
    }

    // Delete Contact
    public void deleteContact(String name) {

        Iterator<Contact> iterator =
                contactList.iterator();

        while (iterator.hasNext()) {

            Contact contact = iterator.next();

            if (contact.firstName.equalsIgnoreCase(name)) {

                iterator.remove();

                System.out.println(
                        "\nContact Deleted Successfully"
                );

                return;
            }
        }

        System.out.println("Contact Not Found");
    }

    // Display Contacts
    public void displayContacts() {

        for (Contact contact : contactList) {

            System.out.println("\n----------------");

            contact.displayContact();
        }
    }
}