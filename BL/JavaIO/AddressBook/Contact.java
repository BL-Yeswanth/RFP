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

    // Override equals Method
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {

            return true;
        }

        if (obj == null
                || getClass() != obj.getClass()) {

            return false;
        }

        Contact contact =
                (Contact) obj;

        return firstName.equals(
                contact.firstName
        );
    }

    // Override hashCode
    @Override
    public int hashCode() {

        return Objects.hash(firstName);
    }

    // Display Contact
    public void displayContact() {

        System.out.println(
                "\nFirst Name : "
                        + firstName
        );

        System.out.println(
                "Last Name : "
                        + lastName
        );

        System.out.println(
                "Address : "
                        + address
        );

        System.out.println(
                "City : "
                        + city
        );

        System.out.println(
                "State : "
                        + state
        );

        System.out.println(
                "Zip : "
                        + zip
        );

        System.out.println(
                "Phone Number : "
                        + phoneNumber
        );

        System.out.println(
                "Email : "
                        + email
        );
    }
}