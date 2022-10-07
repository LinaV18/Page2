package Com.demo.nopcommerce.page;

import Com.demo.nopcommerce.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registerpage {
    WebDriver driver;

    Utils utils;


    By Registerlink = By.className("ico-register");
    By Gender = By.id("gender-female");
    By FirstName = By.xpath("//*[@id=\"FirstName\"]");
    By LastName = By.xpath("//*[@id=\"LastName\"]");
    By Emaild = By.id("Email");
    By password = By.id("Password");
    By ComfirmPassword = By.id("ConfirmPassword");
    By RegisterButton = By.id("register-button");

    public Registerpage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);
    }

        public void clickonRegesterClick(){utils.doClick(Registerlink);}

       // utils.doClick(Gender);
        public void doRegister(String Gender,String FirstName1,String LastName1,String Email1,String Password1,String Comfirmpassword1){

       //utils.doClick(Gender);
       utils.doSendkey(FirstName,FirstName1);
       utils.doSendkey(LastName,LastName1);
       utils.doSendkey(Emaild,Email1);
       utils.doSendkey(password,Password1);
       utils.doSendkey(ComfirmPassword,Comfirmpassword1);
       utils.doClick(RegisterButton);




        }





    }









