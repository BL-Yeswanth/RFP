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

        sc.close();
    }
}