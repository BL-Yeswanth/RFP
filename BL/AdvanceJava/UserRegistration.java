import java.util.regex.Pattern;

public class UserRegistration {

    // First Name Validation
    public static boolean validateFirstName(String firstName)
            throws UserRegistrationException {

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        if (Pattern.matches(regex, firstName)) {
            return true;
        }
        else {
            throw new UserRegistrationException(
                    "Invalid First Name"
            );
        }
    }

    // Last Name Validation
    public static boolean validateLastName(String lastName)
            throws UserRegistrationException {

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        if (Pattern.matches(regex, lastName)) {
            return true;
        }
        else {
            throw new UserRegistrationException(
                    "Invalid Last Name"
            );
        }
    }

    // Email Validation
    public static boolean validateEmail(String email)
            throws UserRegistrationException {

        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        if (Pattern.matches(regex, email)) {
            return true;
        }
        else {
            throw new UserRegistrationException(
                    "Invalid Email"
            );
        }
    }

    // Mobile Validation
    public static boolean validateMobileNumber(String mobile)
            throws UserRegistrationException {

        String regex = "^[0-9]{2}\\s[0-9]{10}$";

        if (Pattern.matches(regex, mobile)) {
            return true;
        }
        else {
            throw new UserRegistrationException(
                    "Invalid Mobile Number"
            );
        }
    }

    // Password Validation
    public static boolean validatePassword(String password)
            throws UserRegistrationException {

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*!]*[@#$%^&*!][^@#$%^&*!]*$).{8,}$";

        if (Pattern.matches(regex, password)) {
            return true;
        }
        else {
            throw new UserRegistrationException(
                    "Invalid Password"
            );
        }
    }
}