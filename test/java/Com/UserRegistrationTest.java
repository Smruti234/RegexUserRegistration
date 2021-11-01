package Com;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenAnyEmail_WhenValidOrNonValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.emailTest("abc+200@gmail.com");
        Assert.assertTrue(userTest);
    }
}
