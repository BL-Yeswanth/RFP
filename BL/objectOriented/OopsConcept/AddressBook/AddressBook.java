package objectOriented.OopsConcept.AddressBook;

/**
 * AddressBook class manages Contact objects.
 */
public class AddressBook {

    public void addContact(Contact contact) {
        System.out.println("\nContact Added Successfully!");
        contact.displayContact();
    }
}
