package objectOriented.OopsConcept.AddressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * AddressBook class manages contacts.
 */
public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("\nContact added successfully!");
        contact.displayContact();
    }

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

    /**
     * Deletes a contact using first name.
     *
     * @param firstName name of the contact to delete
     */
    public void deleteContact(String firstName) {

        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext()) {
            Contact contact = iterator.next();

            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                iterator.remove();
                System.out.println("\nContact deleted successfully!");
                return;
            }
        }

        System.out.println("\nContact not found with name: " + firstName);
    }
}
