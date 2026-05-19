import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationParameterizedTest {

    private String email;
    private boolean expectedResult;

    // Constructor
    public UserRegistrationParameterizedTest(
            String email,
            boolean expectedResult) {

        this.email = email;
        this.expectedResult = expectedResult;
    }

    // Test Data
    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{

                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc@1.com", true},

                {"abc", false},
                {"abc@.com", false},
                {"abc123@gmail.a", false},
                {"abc..2002@gmail.com", false},
                {"abc@gmail.com.1a", false}
        });
    }

    // Parameterized Test
    @Test
    public void givenEmail_ShouldReturnExpectedResult() {

        boolean result =
                UserRegistration
                        .validateEmail(email);

        Assert.assertEquals(
                expectedResult,
                result
        );
    }
}