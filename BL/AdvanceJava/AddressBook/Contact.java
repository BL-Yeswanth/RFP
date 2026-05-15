import java.util.Objects;

public class Contact {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    // Constructor
    public Contact(
            String firstName,
            String lastName,
            String address,
            String city,
            String state,
            String zip,
            String phoneNumber,
            String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Override equals
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {

            return true;
        }

        if (obj == null ||
                getClass() != obj.getClass()) {

            return false;
        }

        Contact contact = (Contact) obj;

        return firstName.equalsIgnoreCase(contact.firstName)
                &&
                lastName.equalsIgnoreCase(contact.lastName);
    }

    // Override hashCode
    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName);
    }

    // Display Contact
    public void displayContact() {

        System.out.println(
                firstName + " " + lastName
        );
    }
}