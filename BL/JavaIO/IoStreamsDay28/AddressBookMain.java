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
                        "Arun",
                        "Kumar",
                        "XYZ Street",
                        "Hyderabad",
                        "Telangana",
                        "500001",
                        "9876501234",
                        "arun@gmail.com"
                )
        );

        addressBook.addContact(
                new Contact(
                        "Kiran",
                        "Reddy",
                        "MG Road",
                        "Bangalore",
                        "Karnataka",
                        "560001",
                        "9988776655",
                        "kiran@gmail.com"
                )
        );

        // Display Sorted Contacts
        System.out.println(
                "\nContacts Sorted Alphabetically"
        );

        addressBook.sortByName();
    }
}