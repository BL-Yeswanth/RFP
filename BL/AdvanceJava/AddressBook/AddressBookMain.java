public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Address Book Program"
        );

        // Create Contact
        Contact contact = new Contact(
                "Yaswanth",
                "Polisetti",
                "ABC Street",
                "Chennai",
                "Tamil Nadu",
                "600001",
                "9876543210",
                "yaswanth@gmail.com"
        );

        // Display Contact
        System.out.println("\nContact Details:\n");

        contact.displayContact();
    }
}