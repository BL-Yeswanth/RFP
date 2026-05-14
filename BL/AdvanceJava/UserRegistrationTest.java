import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    // First Name Test
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {

        boolean result =
                UserRegistration.validateFirstName("Yaswanth");

        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {

        boolean result =
                UserRegistration.validateFirstName("ya");

        Assert.assertFalse(result);
    }

    // Last Name Test
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {

        boolean result =
                UserRegistration.validateLastName("Polisetti");

        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {

        boolean result =
                UserRegistration.validateLastName("po");

        Assert.assertFalse(result);
    }

    // Email Test
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {

        boolean result =
                UserRegistration.validateEmail("abc@yahoo.com");

        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenImproper_ShouldReturnFalse() {

        boolean result =
                UserRegistration.validateEmail("abc@.com");

        Assert.assertFalse(result);
    }

    // Mobile Number Test
    @Test
    public void givenMobile_WhenProper_ShouldReturnTrue() {

        boolean result =
                UserRegistration.validateMobileNumber("91 9876543210");

        Assert.assertTrue(result);
    }

    @Test
    public void givenMobile_WhenImproper_ShouldReturnFalse() {

        boolean result =
                UserRegistration.validateMobileNumber("9876543210");

        Assert.assertFalse(result);
    }

    // Password Test
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {

        boolean result =
                UserRegistration.validatePassword("Password@1");

        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenImproper_ShouldReturnFalse() {

        boolean result =
                UserRegistration.validatePassword("pass");

        Assert.assertFalse(result);
    }
}