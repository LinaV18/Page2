package Com.demo.nopcommerce;

import Com.demo.nopcommerce.base.Basepage;
import Com.demo.nopcommerce.page.Registerpage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Registerpagetest {

    WebDriver driver;
    Basepage basepage;
    Properties prop;
    Registerpage registeruser;


    @BeforeMethod

    public void openbrowser() {
        basepage = new Basepage();
        prop = basepage.initialiseProperties();
        String webEnengie = prop.getProperty("browser");
        driver = basepage.initialiseDriver(webEnengie);
        driver.get(prop.getProperty("url"));
        registeruser = new Registerpage(driver);


    }

    @Test

    public void doRegister(){
        registeruser.clickonRegesterClick();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        registeruser.doRegister(prop.getProperty("Gender"),prop.getProperty("FirstName1"),prop.getProperty("LastName1"),prop.getProperty("Email1"),prop.getProperty("Password1"),prop.getProperty("Comfirmpassword1"));

    }



}
