import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    // Happy Test Case - First Name
    @Test
    public void givenValidFirstName_ShouldReturnTrue() {

        boolean result =
                UserRegistration
                        .validateFirstName("Yaswanth");

        Assert.assertTrue(result);
    }

    // Sad Test Case - First Name
    @Test
    public void givenInvalidFirstName_ShouldReturnFalse() {

        boolean result =
                UserRegistration
                        .validateFirstName("yaswanth");

        Assert.assertFalse(result);
    }

    // Happy Test Case - Last Name
    @Test
    public void givenValidLastName_ShouldReturnTrue() {

        boolean result =
                UserRegistration
                        .validateLastName("Polisetti");

        Assert.assertTrue(result);
    }

    // Sad Test Case - Last Name
    @Test
    public void givenInvalidLastName_ShouldReturnFalse() {

        boolean result =
                UserRegistration
                        .validateLastName("po");

        Assert.assertFalse(result);
    }

    // Happy Test Case - Email
    @Test
    public void givenValidEmail_ShouldReturnTrue() {

        boolean result =
                UserRegistration
                        .validateEmail("abc.xyz@bl.co.in");

        Assert.assertTrue(result);
    }

    // Sad Test Case - Email
    @Test
    public void givenInvalidEmail_ShouldReturnFalse() {

        boolean result =
                UserRegistration
                        .validateEmail("abc@.com");

        Assert.assertFalse(result);
    }

    // Happy Test Case - Mobile Number
    @Test
    public void givenValidMobileNumber_ShouldReturnTrue() {

        boolean result =
                UserRegistration
                        .validateMobileNumber(
                                "91 9919819801"
                        );

        Assert.assertTrue(result);
    }

    // Sad Test Case - Mobile Number
    @Test
    public void givenInvalidMobileNumber_ShouldReturnFalse() {

        boolean result =
                UserRegistration
                        .validateMobileNumber(
                                "919919819801"
                        );

        Assert.assertFalse(result);
    }

    // Happy Test Case - Password
    @Test
    public void givenValidPassword_ShouldReturnTrue() {

        boolean result =
                UserRegistration
                        .validatePassword(
                                "Password1@"
                        );

        Assert.assertTrue(result);
    }

    // Sad Test Case - Password
    @Test
    public void givenInvalidPassword_ShouldReturnFalse() {

        boolean result =
                UserRegistration
                        .validatePassword(
                                "pass"
                        );

        Assert.assertFalse(result);
    }
}