package Com;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenSpecialCharacter_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.specialCharacter("Smrutirt@123");
        Assert.assertTrue(userTest);
    }
}
