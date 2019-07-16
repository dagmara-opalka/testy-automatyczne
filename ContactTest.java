package pop.tests;

import org.kohsuke.rngom.parse.host.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {
    @Test
    public void userShouldBeAbleToSendMessage() {
        homePage.openContactPage();
        contactPage.fillInAndSubmitForm("Dagmara","dagmara@wp.pl","example message");
        String actualText = contactPage.getMessageSentText();
        String exceptedText = "Your message has been sent.";
        Assert.assertEquals(actualText, exceptedText);

    }

}
