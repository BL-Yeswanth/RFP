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

        sc.close();
    }
}