package Day9.AdderssBook;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Contact contact = new Contact(
                "Yeswanth",
                "Polisetti",
                "ABC Street",
                "Hyderabad",
                "Telangana",
                "500001",
                "9876543210",
                "yeswanth@gmail.com"
        );

        contact.displayContact();
    }
}
