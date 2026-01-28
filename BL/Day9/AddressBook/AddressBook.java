package Day9.AddressBook;

import java.util.ArrayList;

public class AddressBook {

    private ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void displayContacts() {
        for (Contact contact : contactList) {
            contact.displayContact();
            System.out.println("-------------------");
        }
    }
}
