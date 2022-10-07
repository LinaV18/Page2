package Com.demo.nopcommerce;

import Com.demo.nopcommerce.base.Basepage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;

public class Basetest {
    WebDriver driver;
    Basepage basePage;
    Properties prop;
    @BeforeMethod
    public void openBrowser()  {
        basePage = new Basepage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
    }


}
