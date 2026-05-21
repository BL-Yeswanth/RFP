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

    // Override toString
    @Override
    public String toString() {

        return "\nFirst Name : " + firstName
                + "\nLast Name : " + lastName
                + "\nCity : " + city
                + "\nState : " + state
                + "\nZip : " + zip
                + "\nPhone Number : " + phoneNumber
                + "\nEmail : " + email;
    }
}