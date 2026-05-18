import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    // First Name Test
    @Test
    public void givenInvalidFirstName_ShouldThrowException() {

        try {

            UserRegistration
                    .validateFirstName("yas");

        } catch (UserRegistrationException e) {

            Assert.assertEquals(
                    UserRegistrationException
                            .ExceptionType
                            .INVALID_FIRST_NAME,

                    e.type
            );
        }
    }

    // Last Name Test
    @Test
    public void givenInvalidLastName_ShouldThrowException() {

        try {

            UserRegistration
                    .validateLastName("po");

        } catch (UserRegistrationException e) {

            Assert.assertEquals(
                    UserRegistrationException
                            .ExceptionType
                            .INVALID_LAST_NAME,

                    e.type
            );
        }
    }

    // Email Test
    @Test
    public void givenInvalidEmail_ShouldThrowException() {

        try {

            UserRegistration
                    .validateEmail("abc@.com");

        } catch (UserRegistrationException e) {

            Assert.assertEquals(
                    UserRegistrationException
                            .ExceptionType
                            .INVALID_EMAIL,

                    e.type
            );
        }
    }

    // Mobile Number Test
    @Test
    public void givenInvalidMobile_ShouldThrowException() {

        try {

            UserRegistration
                    .validateMobileNumber(
                            "919919819801"
                    );

        } catch (UserRegistrationException e) {

            Assert.assertEquals(
                    UserRegistrationException
                            .ExceptionType
                            .INVALID_MOBILE_NUMBER,

                    e.type
            );
        }
    }

    // Password Test
    @Test
    public void givenInvalidPassword_ShouldThrowException() {

        try {

            UserRegistration
                    .validatePassword("pass");

        } catch (UserRegistrationException e) {

            Assert.assertEquals(
                    UserRegistrationException
                            .ExceptionType
                            .INVALID_PASSWORD,

                    e.type
            );
        }
    }
}