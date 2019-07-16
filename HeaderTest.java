package exercise_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.xml.ws.WebEndpoint;

public class HeaderTest {
    private WebDriver driver;

    @BeforeMethod
    public  void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Test
    public void pageleaderShouldBeCorrect(){
        driver.get("http://jacekokrojek.github.io/jak-to-zrobic-w-js/#");
        WebElement header = driver.findElement(By.xpath("//h1[text() = \"Example headline 1\"]  "));
       String headerText = header.getText();
        Assert.assertEquals("Example Headline 1", headerText);

    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
