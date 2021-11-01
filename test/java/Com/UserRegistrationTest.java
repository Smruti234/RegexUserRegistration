package Com;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenPassword_WhenCorrect_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.passwordTest("smrutier");
        Assert.assertTrue(userTest);
    }
}
