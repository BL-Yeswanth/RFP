package objectOriented.OopsConcept.AddressBook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBookSystem system = new AddressBookSystem();

        while (true) {

            System.out.println("\n1. Add Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Show Address Books");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Address Book Name: ");
                    String bookName = scanner.nextLine().trim();
                    system.addAddressBook(bookName);
                    break;

                case 2:
                    System.out.print("Enter Address Book Name: ");
                    bookName = scanner.nextLine().trim();
                    AddressBook addBook = system.getAddressBook(bookName);

                    if (addBook == null) {
                        System.out.println("Address Book not found!");
                        break;
                    }

                    Contact contact = readContact(scanner);
                    addBook.addContact(contact);
                    break;

                case 3:
                    System.out.print("Enter Address Book Name: ");
                    bookName = scanner.nextLine().trim();
                    AddressBook editBook = system.getAddressBook(bookName);

                    if (editBook == null) {
                        System.out.println("Address Book not found!");
                        break;
                    }

                    System.out.print("Enter First Name to edit: ");
                    String editName = scanner.nextLine().trim();

                    Contact updatedContact = readContact(scanner);
                    editBook.editContact(editName, updatedContact);
                    break;

                case 4:
                    System.out.print("Enter Address Book Name: ");
                    bookName = scanner.nextLine().trim();
                    AddressBook deleteBook = system.getAddressBook(bookName);

                    if (deleteBook == null) {
                        System.out.println("Address Book not found!");
                        break;
                    }

                    System.out.print("Enter First Name to delete: ");
                    String deleteName = scanner.nextLine().trim();
                    deleteBook.deleteContact(deleteName);
                    break;

                case 5:
                    system.displayAddressBooks();
                    break;

                case 6:
                    System.out.println("Exiting Address Book Program");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    /**
     * Reads contact details from console.
     */
    private static Contact readContact(Scanner scanner) {

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("State: ");
        String state = scanner.nextLine();

        System.out.print("Zip: ");
        String zip = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        return new Contact(firstName, lastName, address, city, state, zip, phone, email);
    }
}
