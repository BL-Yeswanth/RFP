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

    public static void main(String[] args) {

        String firstName = "Yaswanth";

        boolean result =
                validateFirstName(firstName);

        if (result) {

            System.out.println(
                    "Valid First Name"
            );

        } else {

            System.out.println(
                    "Invalid First Name"
            );
        }
    }
}