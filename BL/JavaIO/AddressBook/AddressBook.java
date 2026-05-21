import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(
            Contact contact) {

        contactList.add(contact);
    }

    // Write Contacts To File
    public void writeContactsToFile(
            String fileName) {

        try {

            FileWriter writer =
                    new FileWriter(fileName);

            for (Contact contact
                    : contactList) {

                writer.write(
                        contact.toString()
                                + "\n"
                );
            }

            writer.close();

            System.out.println(
                    "Contacts Written To File Successfully"
            );

        } catch (IOException e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }

    // Read Contacts From File
    public void readContactsFromFile(
            String fileName) {

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(fileName)
                    );

            String line;

            System.out.println(
                    "\nContacts From File"
            );

            while ((line = reader.readLine())
                    != null) {

                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
}