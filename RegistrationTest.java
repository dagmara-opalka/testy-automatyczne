package pop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    @Test
    public void UserShouldBeAbleToRegisterTest() {
        homePage.openRegistrationForm();
        registrationFormPage.fillInAndSubmitForm("Dagmara","dagmara@wp.pl","abcd","abcd");
    boolean result = registrationConfrim.isHeaderDisplayed();
        Assert.assertTrue(result);
}
}