package pop.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BasePage {
    protected WebDriver driver;

    @FindBy(xpath = "//a[text()=\"Services\"]/../a")
    private  WebElement serviceButton;

    @FindBy(xpath = "//a[text()=\"Contact\"]")
    private WebElement contactButton;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void openServicesPage() { serviceButton.click(); }

    public void openContactPage() { contactButton.click(); }

    public void mySendKeys(WebElement element, String text) {
                System.out.println("Wpisuję w element: " + element.toString() + " tekst: " + text);
                element.click();
                element.clear();
                element.sendKeys(text);
//robi metoda screenshoty
            }
            public void takeScreenshot() {
                Screenshot scr = new AShot().takeScreenshot(driver);
                File file = new File("screenshot"+ new Date().getTime() + "..png");

                try
                {
                    ImageIO.write(scr.getImage(), formatName"png", file);

                } catch (IOException e) {

                    e.printStackTrace();
                }

                public void takeElementScreenshot(WebElement element) {

                    File file = new File("src/test/resources/screenshots/element_screenshot-" +new Date().getTime() + "..png" );
                    try{
                        ImageIO.write(scr.getImage(), formatName"png", file);
                    } catch (IOException e) {

                        e.printStackTrace();
                    }
                }



            }

            public void myClick(WebElement element) {
                System.out.println("Klikam w element: " +element.toString()+ "element" + element);
            element.click();
            element.clear();
            element.myClick(element);

            }

    }

