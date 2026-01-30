package objectOriented.OopsConcept.AddressBook;

import java.util.Scanner;

/**
 * Address Book Main Application
 */
public class AddressBookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Welcome to Address Book Program");

        boolean addMoreContacts = true;

        while (addMoreContacts) {

            System.out.println("\nEnter Contact Details");

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("City: ");
            String city = scanner.nextLine();

            System.out.print("State: ");
            String state = scanner.nextLine();

            System.out.print("Zip: ");
            String zip = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phone = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            Contact contact = new Contact(
                    firstName, lastName, address, city, state, zip, phone, email
            );

            addressBook.addContact(contact);

            System.out.print("\nDo you want to add another contact? (yes/no): ");
            String choice = scanner.nextLine();

            if (!choice.equalsIgnoreCase("yes")) {
                addMoreContacts = false;
            }
        }

        addressBook.displayAllContacts();
        scanner.close();
    }
}
