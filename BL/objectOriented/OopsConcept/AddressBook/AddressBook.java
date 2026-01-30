package objectOriented.OopsConcept.AddressBook;

import java.util.ArrayList;
import java.util.List;

/**
 * AddressBook class manages contacts.
 */
public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    /**
     * Adds a new contact to the address book.
     *
     * @param contact Contact object
     */
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("\nContact added successfully!");
        contact.displayContact();
    }

    /**
     * Edits an existing contact using first name.
     *
     * @param firstName      name to search
     * @param updatedContact updated contact details
     */
    public void editContact(String firstName, Contact updatedContact) {

        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {

                contact.setLastName(updatedContact.getLastName());
                contact.setAddress(updatedContact.getAddress());
                contact.setCity(updatedContact.getCity());
                contact.setState(updatedContact.getState());
                contact.setZip(updatedContact.getZip());
                contact.setPhoneNumber(updatedContact.getPhoneNumber());
                contact.setEmail(updatedContact.getEmail());

                System.out.println("\nContact updated successfully!");
                contact.displayContact();
                return;
            }
        }

        System.out.println("\nContact not found with name: " + firstName);
    }
}
