import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    // Validate First Name
    public static boolean validateFirstName(String firstName) {

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        return Pattern.matches(regex, firstName);
    }

    // Validate Last Name
    public static boolean validateLastName(String lastName) {

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        return Pattern.matches(regex, lastName);
    }

    // Validate Email
    public static boolean validateEmail(String email) {

        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        return Pattern.matches(regex, email);
    }

    // Validate Mobile Number
    public static boolean validateMobileNumber(String mobile) {

        String regex = "^[0-9]{2}\\s[0-9]{10}$";

        return Pattern.matches(regex, mobile);
    }

    // Validate Password
    // Rule 1 -> Minimum 8 Characters
    // Rule 2 -> At least 1 Uppercase Letter
    // Rule 3 -> At least 1 Numeric Number
    // Rule 4 -> Exactly 1 Special Character
    public static boolean validatePassword(String password) {

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*!]*[@#$%^&*!][^@#$%^&*!]*$).{8,}$";

        return Pattern.matches(regex, password);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First Name
        System.out.println("Enter First Name:");
        String firstName = sc.nextLine();

        if (validateFirstName(firstName)) {
            System.out.println("Valid First Name");
        }
        else {
            System.out.println("Invalid First Name");
        }

        // Last Name
        System.out.println("Enter Last Name:");
        String lastName = sc.nextLine();

        if (validateLastName(lastName)) {
            System.out.println("Valid Last Name");
        }
        else {
            System.out.println("Invalid Last Name");
        }

        // Email
        System.out.println("Enter Email:");
        String email = sc.nextLine();

        if (validateEmail(email)) {
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }

        // Mobile Number
        System.out.println("Enter Mobile Number:");
        String mobile = sc.nextLine();

        if (validateMobileNumber(mobile)) {
            System.out.println("Valid Mobile Number");
        }
        else {
            System.out.println("Invalid Mobile Number");
        }

        // Password
        System.out.println("Enter Password:");
        String password = sc.nextLine();

        if (validatePassword(password)) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}