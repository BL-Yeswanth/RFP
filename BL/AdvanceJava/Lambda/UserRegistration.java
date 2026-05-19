import java.util.regex.Pattern;

public class UserRegistration {

    // Lambda Validation - First Name
    static UserValidation firstNameValidator =
            firstName ->
                    Pattern.matches(
                            "^[A-Z][a-zA-Z]{2,}$",
                            firstName
                    );

    // Lambda Validation - Last Name
    static UserValidation lastNameValidator =
            lastName ->
                    Pattern.matches(
                            "^[A-Z][a-zA-Z]{2,}$",
                            lastName
                    );

    // Lambda Validation - Email
    static UserValidation emailValidator =
            email ->
                    Pattern.matches(
                            "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$",
                            email
                    );

    // Lambda Validation - Mobile Number
    static UserValidation mobileValidator =
            mobile ->
                    Pattern.matches(
                            "^[0-9]{2}\\s[0-9]{10}$",
                            mobile
                    );

    // Lambda Validation - Password
    static UserValidation passwordValidator =
            password ->
                    Pattern.matches(
                            "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*!]*[@#$%^&*!][^@#$%^&*!]*$).{8,}$",
                            password
                    );

    public static void main(String[] args) {

        System.out.println(
                "First Name : "
                        +
                        firstNameValidator
                                .validate("Yaswanth")
        );

        System.out.println(
                "Last Name : "
                        +
                        lastNameValidator
                                .validate("Polisetti")
        );

        System.out.println(
                "Email : "
                        +
                        emailValidator
                                .validate("abc.xyz@bl.co.in")
        );

        System.out.println(
                "Mobile Number : "
                        +
                        mobileValidator
                                .validate("91 9919819801")
        );

        System.out.println(
                "Password : "
                        +
                        passwordValidator
                                .validate("Password1@")
        );
    }
}