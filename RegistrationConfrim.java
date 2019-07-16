package pop.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationConfrim {
    private WebDriver   driver;
    private By pageHeader = By.cssSelector("div > h2");


    public RegistrationConfrim(WebDriver driver) {
    this.driver = driver;


    }
    public boolean  isHeaderDisplayed() {
        return  driver.findElement(pageHeader).isDisplayed();
    }
    public String getHeaderText() {

        return driver.findElement(pageHeader).getText();
    }
}
