package pop.pageobjects;

import org.kohsuke.rngom.parse.host.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicesPage extends BasePage {
    private WebDriver driver;

   // private By pigText = By.xpath("(//div[@class=\"span6\"]//p)[3]");
    @FindBy(xpath ="(//div[@class=\"span6\"]//p)[3]")
    private WebElement pigText;

    public ServicesPage(WebDriver driver) {
        this.driver = driver;


    }

    public String getPigText() {
     //   return driver.findElement(pigText).getText();
        return pigText.getText();
    }
}
