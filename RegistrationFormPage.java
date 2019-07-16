package pop.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;

public class RegistrationFormPage {
    private WebDriver driver;
    private By usernameInput = By.id("usernamesignup");
    private By  emailInput = By.id("emailsignup");
    private By passwordInput = By.id("passwordsignup");
    private By passwordComfirmInput = By.id("passwordsignup_confirm");
    private By submitButton = By.cssSelector("a[type=\"button\"]");

    public RegistrationFormPage(WebDriver driver) {

        this.driver = driver;
    }
    public void fillInAndSubmitForm(String username,String email, String password, String passwordConfirm) {

        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(passwordComfirmInput).sendKeys(passwordConfirm);
        driver.findElement(submitButton).click();
}
}