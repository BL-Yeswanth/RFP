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

        // File Name
        String fileName =
                "addressbook.txt";

        // Write To File
        addressBook.writeContactsToFile(
                fileName
        );

        // Read From File
        addressBook.readContactsFromFile(
                fileName
        );
    }
}