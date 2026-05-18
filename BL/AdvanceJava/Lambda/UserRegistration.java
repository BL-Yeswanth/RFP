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

    // Validate Email
    public static boolean validateEmail(
            String email) {

        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        return Pattern.matches(
                regex,
                email
        );
    }

    public static void main(String[] args) {

        String firstName = "Yaswanth";
        String lastName = "Polisetti";
        String email = "abc.xyz@bl.co.in";

        boolean firstNameResult =
                validateFirstName(firstName);

        boolean lastNameResult =
                validateLastName(lastName);

        boolean emailResult =
                validateEmail(email);

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

        if (emailResult) {

            System.out.println(
                    "Valid Email"
            );

        } else {

            System.out.println(
                    "Invalid Email"
            );
        }
    }
}