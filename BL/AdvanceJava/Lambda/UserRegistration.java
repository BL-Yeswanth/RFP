import java.util.regex.Pattern;

public class UserRegistration {

    // Validate First Name
    public static boolean validateFirstName(
            String firstName) {

        String regex =
                "^[A-Z][a-zA-Z]{2,}$";

        return Pattern.matches(
                regex,
                firstName
        );
    }

    // Validate Last Name
    public static boolean validateLastName(
            String lastName) {

        String regex =
                "^[A-Z][a-zA-Z]{2,}$";

        return Pattern.matches(
                regex,
                lastName
        );
    }

    public static void main(String[] args) {

        String firstName = "Yaswanth";
        String lastName = "Polisetti";

        boolean firstNameResult =
                validateFirstName(firstName);

        boolean lastNameResult =
                validateLastName(lastName);

        if (firstNameResult) {

            System.out.println(
                    "Valid First Name"
            );

        } else {

            System.out.println(
                    "Invalid First Name"
            );
        }

        if (lastNameResult) {

            System.out.println(
                    "Valid Last Name"
            );

        } else {

            System.out.println(
                    "Invalid Last Name"
            );
        }
    }
}