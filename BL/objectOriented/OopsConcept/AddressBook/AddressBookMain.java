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

        /* ---------- Add Contact ---------- */

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

        /* ---------- Edit Contact ---------- */

        System.out.print("\nEnter First Name to Edit Contact: ");
        String editName = scanner.nextLine();

        System.out.println("Enter Updated Details");

        System.out.print("New Last Name: ");
        lastName = scanner.nextLine();

        System.out.print("New Address: ");
        address = scanner.nextLine();

        System.out.print("New City: ");
        city = scanner.nextLine();

        System.out.print("New State: ");
        state = scanner.nextLine();

        System.out.print("New Zip: ");
        zip = scanner.nextLine();

        System.out.print("New Phone Number: ");
        phone = scanner.nextLine();

        System.out.print("New Email: ");
        email = scanner.nextLine();

        Contact updatedContact = new Contact(
                editName, lastName, address, city, state, zip, phone, email
        );

        addressBook.editContact(editName, updatedContact);

        /* ---------- Delete Contact ---------- */

        System.out.print("\nEnter First Name to Delete Contact: ");
        String deleteName = scanner.nextLine();

        addressBook.deleteContact(deleteName);

        scanner.close();
    }
}
