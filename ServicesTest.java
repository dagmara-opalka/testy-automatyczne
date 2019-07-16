package pop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ServicesTest extends BaseTest {

    @Test
    public void pigTextShouldBeCorrect() {

        homePage.openServicesPage();
        String  actualText = servicesPage.getPigText();
        String  expectedText = "Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.";
        Assert.assertEquals(actualText, expectedText);
    }
}
