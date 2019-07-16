package pop.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    private WebDriver driver;

   /* private By  signUpTodayButton = By.xpath("//h1[text() = \"Example headline 1\"]/../a");
    private By serviceButton = By.xpath("//a[text()=\"Services\"]");
    private By contactButton = By.xpath("//a[text()=\"Contact\"]f");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void openRegistrationForm() {
        driver.findElement(signUpTodayButton).click();
    }

    public void openServicesPage() {

        driver.findElement(serviceButton).click();
    }
    public void openContactPage() {

        driver.findElement(contactButton).click();
    }
} */

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


