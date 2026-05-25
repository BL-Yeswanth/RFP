import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    // Collection To Store Contacts
    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(
            Contact contact) {

        contactList.add(contact);
    }

    // Write Contacts To CSV File
    public void writeContactsToCSV(
            String fileName) {

        try {

            CSVWriter writer =
                    new CSVWriter(
                            new FileWriter(fileName)
                    );

            // Header
            String[] header = {
                    "FirstName",
                    "LastName",
                    "Address",
                    "City",
                    "State",
                    "Zip",
                    "PhoneNumber",
                    "Email"
            };

            writer.writeNext(header);

            // Contact Data
            for (Contact contact
                    : contactList) {

                String[] data = {
                        contact.firstName,
                        contact.lastName,
                        contact.address,
                        contact.city,
                        contact.state,
                        contact.zip,
                        contact.phoneNumber,
                        contact.email
                };

                writer.writeNext(data);
            }

            writer.close();

            System.out.println(
                    "\nContacts Written To CSV File Successfully"
            );

        } catch (IOException e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }

    // Read Contacts From CSV File
    public void readContactsFromCSV(
            String fileName) {

        try {

            CSVReader reader =
                    new CSVReader(
                            new FileReader(fileName)
                    );

            List<String[]> contacts =
                    reader.readAll();

            System.out.println(
                    "\nContacts From CSV File"
            );

            for (String[] contact
                    : contacts) {

                for (String value
                        : contact) {

                    System.out.print(
                            value + " "
                    );
                }

                System.out.println();
            }

            reader.close();

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
}