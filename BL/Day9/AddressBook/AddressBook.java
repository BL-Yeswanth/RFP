package Day9.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void editContact(String firstName) {

        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        for (Contact contact : contactList) {

            if (contact.getFirstName().equalsIgnoreCase(firstName)) {

                System.out.print("Enter New Last Name: ");
                contact.setLastName(scanner.nextLine());

                System.out.print("Enter New Address: ");
                contact.setAddress(scanner.nextLine());

                System.out.print("Enter New City: ");
                contact.setCity(scanner.nextLine());

                System.out.print("Enter New State: ");
                contact.setState(scanner.nextLine());

                System.out.print("Enter New Zip: ");
                contact.setZip(scanner.nextLine());

                System.out.print("Enter New Phone Number: ");
                contact.setPhoneNumber(scanner.nextLine());

                System.out.print("Enter New Email: ");
                contact.setEmail(scanner.nextLine());

                System.out.println("\nContact Updated Successfully");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact Not Found");
        }
    }

    public void displayContacts() {
        for (Contact contact : contactList) {
            contact.displayContact();
            System.out.println("--------------------");
        }
    }
}
