import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    // First Name Test
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {

        try {

            boolean result =
                    UserRegistration.validateFirstName("Yaswanth");

            Assert.assertTrue(result);

        } catch (UserRegistrationException e) {

            Assert.fail();
        }
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldThrowException() {

        try {

            UserRegistration.validateFirstName("ya");

        } catch (UserRegistrationException e) {

            Assert.assertEquals(
                    "Invalid First Name",
                    e.getMessage()
            );
        }
    }

    // Last Name Test
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {

        try {

            boolean result =
                    UserRegistration.validateLastName("Polisetti");

            Assert.assertTrue(result);

        } catch (UserRegistrationException e) {

            Assert.fail();
        }
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldThrowException() {

        try {

            UserRegistration.validateLastName("po");

        } catch (UserRegistrationException e) {

            Assert.assertEquals(
                    "Invalid Last Name",
                    e.getMessage()
            );
        }
    }

    // Email Test
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {

        try {

            boolean result =
                    UserRegistration.validateEmail(
                            "abc@yahoo.com"
                    );

            Assert.assertTrue(result);

        } catch (UserRegistrationException e) {

            Assert.fail();
        }
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldThrowException() {

        try {

            UserRegistration.validateEmail("abc@.com");

        } catch (UserRegistrationException e) {

            Assert.assertEquals(
                    "Invalid Email",
                    e.getMessage()
            );
        }
    }

    // Mobile Number Test
    @Test
    public void givenMobile_WhenValid_ShouldReturnTrue() {

        try {

            boolean result =
                    UserRegistration.validateMobileNumber(
                            "91 9876543210"
                    );

            Assert.assertTrue(result);

        } catch (UserRegistrationException e) {

            Assert.fail();
        }
    }

    @Test
    public void givenMobile_WhenInvalid_ShouldThrowException() {

        try {

            UserRegistration.validateMobileNumber(
                    "9876543210"
            );

        } catch (UserRegistrationException e) {

            Assert.assertEquals(
                    "Invalid Mobile Number",
                    e.getMessage()
            );
        }
    }

    // Password Test
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {

        try {

            boolean result =
                    UserRegistration.validatePassword(
                            "Password@1"
                    );

            Assert.assertTrue(result);

        } catch (UserRegistrationException e) {

            Assert.fail();
        }
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldThrowException() {

        try {

            UserRegistration.validatePassword("pass");

        } catch (UserRegistrationException e) {

            Assert.assertEquals(
                    "Invalid Password",
                    e.getMessage()
            );
        }
    }
}