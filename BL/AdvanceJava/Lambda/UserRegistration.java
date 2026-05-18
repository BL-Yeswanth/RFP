import java.util.regex.Pattern;

public class UserRegistration {

    // First Name Validation
    public static boolean validateFirstName(
            String firstName)
            throws UserRegistrationException {

        String regex =
                "^[A-Z][a-zA-Z]{2,}$";

        if (Pattern.matches(regex, firstName)) {

            return true;
        }

        throw new UserRegistrationException(
                UserRegistrationException
                        .ExceptionType
                        .INVALID_FIRST_NAME,

                "Invalid First Name"
        );
    }

    // Last Name Validation
    public static boolean validateLastName(
            String lastName)
            throws UserRegistrationException {

        String regex =
                "^[A-Z][a-zA-Z]{2,}$";

        if (Pattern.matches(regex, lastName)) {

            return true;
        }

        throw new UserRegistrationException(
                UserRegistrationException
                        .ExceptionType
                        .INVALID_LAST_NAME,

                "Invalid Last Name"
        );
    }

    // Email Validation
    public static boolean validateEmail(
            String email)
            throws UserRegistrationException {

        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        if (Pattern.matches(regex, email)) {

            return true;
        }

        throw new UserRegistrationException(
                UserRegistrationException
                        .ExceptionType
                        .INVALID_EMAIL,

                "Invalid Email"
        );
    }

    // Mobile Number Validation
    public static boolean validateMobileNumber(
            String mobileNumber)
            throws UserRegistrationException {

        String regex =
                "^[0-9]{2}\\s[0-9]{10}$";

        if (Pattern.matches(regex, mobileNumber)) {

            return true;
        }

        throw new UserRegistrationException(
                UserRegistrationException
                        .ExceptionType
                        .INVALID_MOBILE_NUMBER,

                "Invalid Mobile Number"
        );
    }

    // Password Validation
    public static boolean validatePassword(
            String password)
            throws UserRegistrationException {

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*!]*[@#$%^&*!][^@#$%^&*!]*$).{8,}$";

        if (Pattern.matches(regex, password)) {

            return true;
        }

        throw new UserRegistrationException(
                UserRegistrationException
                        .ExceptionType
                        .INVALID_PASSWORD,

                "Invalid Password"
        );
    }
}