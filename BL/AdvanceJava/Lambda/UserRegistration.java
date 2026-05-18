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

    // Validate Mobile Number
    public static boolean validateMobileNumber(
            String mobileNumber) {

        String regex =
                "^[0-9]{2}\\s[0-9]{10}$";

        return Pattern.matches(
                regex,
                mobileNumber
        );
    }

    // Validate Password
    public static boolean validatePassword(
            String password) {

        /*
         Rule 1 -> Minimum 8 Characters
         Rule 2 -> At least 1 Upper Case
         Rule 3 -> At least 1 Numeric Number
        */

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";

        return Pattern.matches(
                regex,
                password
        );
    }

    public static void main(String[] args) {

        String firstName = "Yaswanth";
        String lastName = "Polisetti";
        String email = "abc.xyz@bl.co.in";
        String mobileNumber = "91 9919819801";
        String password = "Password1";

        boolean firstNameResult =
                validateFirstName(firstName);

        boolean lastNameResult =
                validateLastName(lastName);

        boolean emailResult =
                validateEmail(email);

        boolean mobileResult =
                validateMobileNumber(mobileNumber);

        boolean passwordResult =
                validatePassword(password);

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

        if (mobileResult) {

            System.out.println(
                    "Valid Mobile Number"
            );

        } else {

            System.out.println(
                    "Invalid Mobile Number"
            );
        }

        if (passwordResult) {

            System.out.println(
                    "Valid Password"
            );

        } else {

            System.out.println(
                    "Invalid Password"
            );
        }
    }
}