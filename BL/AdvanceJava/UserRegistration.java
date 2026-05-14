import java.util.regex.Pattern;

public class UserRegistration {

    // First Name Validation
    public static boolean validateFirstName(String firstName) {

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        return Pattern.matches(regex, firstName);
    }

    // Last Name Validation
    public static boolean validateLastName(String lastName) {

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        return Pattern.matches(regex, lastName);
    }

    // Email Validation
    public static boolean validateEmail(String email) {

        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        return Pattern.matches(regex, email);
    }

    // Mobile Validation
    public static boolean validateMobileNumber(String mobile) {

        String regex = "^[0-9]{2}\\s[0-9]{10}$";

        return Pattern.matches(regex, mobile);
    }

    // Password Validation
    public static boolean validatePassword(String password) {

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*!]*[@#$%^&*!][^@#$%^&*!]*$).{8,}$";

        return Pattern.matches(regex, password);
    }
}