package exercise_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Open the URL, find button Sign Up, click it, find header, download text, asertion
public class SignUpTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Test
    public void regestrationShouldBeCorrect() {

        driver.get("http://example.io");
        WebElement signup = driver.findElement(By.xpath("//a[text()=\"Sign up today\"]"));
        signup.click();
        WebElement signup1 = driver.findElement(By.xpath("//h1[contains(text(), \"Sign up\")]"));
        driver.findElement(By.xpath("//h1[contains(text(), \"Sign up\")] "));
        String signup1Text = signup1.getText();
        Assert.assertEquals("Sign up", signup1Text);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
