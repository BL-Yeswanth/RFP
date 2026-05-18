import java.util.regex.Pattern;

public class UserRegistration {

    // Validate First Name
    public static boolean validateFirstName(
            String firstName) {

        String regex =
                "^[A-Z][a-zA-Z]{2,}$";

        return Pattern.matches(regex, firstName);
    }

    // Validate Last Name
    public static boolean validateLastName(
            String lastName) {

        String regex =
                "^[A-Z][a-zA-Z]{2,}$";

        return Pattern.matches(regex, lastName);
    }

    // Validate Email
    public static boolean validateEmail(
            String email) {

        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        return Pattern.matches(regex, email);
    }

    // Validate Mobile Number
    public static boolean validateMobileNumber(
            String mobileNumber) {

        String regex =
                "^[0-9]{2}\\s[0-9]{10}$";

        return Pattern.matches(regex, mobileNumber);
    }

    // Validate Password
    public static boolean validatePassword(
            String password) {

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*!]*[@#$%^&*!][^@#$%^&*!]*$).{8,}$";

        return Pattern.matches(regex, password);
    }

    public static void main(String[] args) {

        // Email Samples
        String[] validEmails = {

                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };

        String[] invalidEmails = {

                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        System.out.println(
                "Valid Email Samples:"
        );

        for (String email : validEmails) {

            if (validateEmail(email)) {

                System.out.println(
                        email + " -> Valid"
                );

            } else {

                System.out.println(
                        email + " -> Invalid"
                );
            }
        }

        System.out.println(
                "\nInvalid Email Samples:"
        );

        for (String email : invalidEmails) {

            if (validateEmail(email)) {

                System.out.println(
                        email + " -> Valid"
                );

            } else {

                System.out.println(
                        email + " -> Invalid"
                );
            }
        }
    }
}