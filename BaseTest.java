package pop.tests;
//to jest klasa bazowa ktora bedziemy wykorzystywac w innych testach
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pop.pageobjects.*;

public class BaseTest {
    protected WebDriver driver; //protected bo bedziemy dziedziczyc z tej klasy
    protected HomePage  homePage;
    protected RegistrationConfrim registrationConfrim;
    protected RegistrationFormPage registrationFormPage;
    protected ServicesPage servicesPage;
    protected ContactPage contactPage;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();     //ustawianie drivera
        driver  =   new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://jacekokrojek.github.io/jak-to-zrobic-w-js/");

        homePage = new HomePage(driver);
        registrationFormPage = new RegistrationFormPage(driver);
        registrationConfrim = new RegistrationConfrim(driver);
        servicesPage = new ServicesPage(driver);
        contactPage = new ContactPage(driver);


    }
    @AfterMethod
    public  void tearDown() {

        driver.quit();  //w tej metodzie nam zamyka
    }
}
