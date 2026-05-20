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
                "City : "
                        + city
        );

        System.out.println(
                "State : "
                        + state
        );
    }
}