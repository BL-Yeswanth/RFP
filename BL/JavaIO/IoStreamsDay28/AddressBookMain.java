public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome To Address Book Program"
        );

        AddressBook addressBook =
                new AddressBook();

        // Add Contacts
        addressBook.addContact(
                new Contact(
                        "Yaswanth",
                        "Polisetti",
                        "ABC Street",
                        "Chennai",
                        "Tamil Nadu",
                        "600001",
                        "9876543210",
                        "yas@gmail.com"
                )
        );

        addressBook.addContact(
                new Contact(
                        "Kiran",
                        "Kumar",
                        "XYZ Street",
                        "Hyderabad",
                        "Telangana",
                        "500001",
                        "9876501234",
                        "kiran@gmail.com"
                )
        );

        // CSV File Name
        String fileName =
                "addressbook.csv";

        // Write To CSV File
        addressBook.writeContactsToCSV(
                fileName
        );

        // Read From CSV File
        addressBook.readContactsFromCSV(
                fileName
        );
    }
}