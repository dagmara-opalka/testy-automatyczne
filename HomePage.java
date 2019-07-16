package pop.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    private WebDriver driver;


   @FindBy(xpath = "//h1[text() = \"Example headline 1\"]/../a")
    private WebElement  signUpTodayButton;



   public HomePage(WebDriver driver) {
        super(driver);
   }
    public void openRegistrationForm() {
       signUpTodayButton.click();
    }

    public void openServicesPage() {

        serviceButton.click();
    }
    public void openContactPage() {

        contactButton.click();
    }
}


