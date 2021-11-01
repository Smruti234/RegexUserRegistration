package Com;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.email("lenkasmruti.xyz@slen.com.in");
        Assert.assertTrue(userTest);
    }
}
