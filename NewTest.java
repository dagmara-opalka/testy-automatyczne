package exercise_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
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

        driver.get("http://jacekokrojek.github.io/jak-to-zrobic-w-js/#");
        WebElement signup = driver.findElement(By.xpath("//a[text()=\"Sign up today\"]"));
        signup.click();
        WebElement username = driver.findElement(By.xpath("//*[@id=\"usernamesignup\"]"));
        username.sendKeys("\"abdcd\"");
        WebElement email = driver.findElement(By.xpath("//*[@id=\"emailsignup\"]"));
        email.sendKeys("\"test@gmail.com\"");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"passwordsignup\"]"));
        password.sendKeys("aaaaaaaaa");
        WebElement password2 = driver.findElement(By.xpath("//*[@id=\"passwordsignup_confirm\"]"));
        password2.sendKeys("aaaaaaaaa");
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"register\"]/form/p[5]/a"));
        submit.click();
        WebElement thanks = driver.findElement(By.xpath("/html/body/div[2]/div/div/h2"));
        String thanksText = thanks.getText();
        Assert.assertEquals("Thank you for registration", thanksText);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
