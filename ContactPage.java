package pop.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends BasePage {
    private WebDriver driver;



    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id="email")
    private WebElement emailInput;

    @FindBy(id = "content")
    private WebElement messageInput;

    @FindBy(css = "span.message >h3")
    private WebElement messageSentInformation;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement submitButton;

    public ContactPage(WebDriver driver) {
        super(driver);

    }

    public void fillInAndSubmitForm(String name, String email, String content) {
        mySendKeys(nameInput, name);
        mySendKeys(emailInput, email);
        mySendKeys(messageInput, content);
        myClick(submitButton);


    }
    public String getMessageSentText() {
        By waitForMessage = By.cssSelector("span.message >h3");
        WebDriverWait wait = new WebDriverWait(driver,  10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitForMessage));
        return messageSentInformation.getText();
    }
}
