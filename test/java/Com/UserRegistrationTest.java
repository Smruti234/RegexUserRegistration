package Com;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenPhoneNumber_WhenCorrect_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.phoneNumber("91 7504614661");
        Assert.assertTrue(userTest);
    }
}
