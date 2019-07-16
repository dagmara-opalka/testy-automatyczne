package pop.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pop.pageobjects.*;

//base test which we will use in other tests
public class BaseTest {
    protected WebDriver driver;
    protected HomePage  homePage;
    protected RegistrationConfrim registrationConfrim;
    protected RegistrationFormPage registrationFormPage;
    protected ServicesPage servicesPage;
    protected ContactPage contactPage;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();     //set up the driver
        driver  =   new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://example.io/"); //change to a real website

        homePage = new HomePage(driver);
        registrationFormPage = new RegistrationFormPage(driver);
        registrationConfrim = new RegistrationConfrim(driver);
        servicesPage = new ServicesPage(driver);
        contactPage = new ContactPage(driver);


    }
    @AfterMethod
    public  void tearDown() {

        driver.quit();  
    }
}
