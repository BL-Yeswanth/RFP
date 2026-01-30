package objectOriented.OopsConcept.AddressBook;

import java.util.HashMap;
import java.util.Map;

/**
 * AddressBookSystem manages multiple AddressBooks.
 */
public class AddressBookSystem {

    private Map<String, AddressBook> addressBookMap = new HashMap<>();

    /**
     * Adds a new AddressBook with a unique name.
     *
     * @param name address book name
     */
    public void addAddressBook(String name) {

        if (addressBookMap.containsKey(name)) {
            System.out.println("\nAddress Book already exists with name: " + name);
            return;
        }

        addressBookMap.put(name, new AddressBook());
        System.out.println("\nAddress Book created successfully with name: " + name);
    }

    /**
     * Retrieves AddressBook by name.
     *
     * @param name address book name
     * @return AddressBook
     */
    public AddressBook getAddressBook(String name) {
        return addressBookMap.get(name);
    }

    /**
     * Displays all Address Book names.
     */
    public void displayAddressBooks() {

        if (addressBookMap.isEmpty()) {
            System.out.println("\nNo Address Books available.");
            return;
        }

        System.out.println("\nAvailable Address Books:");
        for (String name : addressBookMap.keySet()) {
            System.out.println("- " + name);
        }
    }
}
