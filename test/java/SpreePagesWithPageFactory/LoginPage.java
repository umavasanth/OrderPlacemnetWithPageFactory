package SpreePagesWithPageFactory;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class LoginPage{

    @FindBy(id="spree_user_email")
    private WebElement userEmail;


    @FindBy(id="spree_user_password")
    private WebElement txtPassword;

    @FindBy(css ="input[name='commit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void loginApp(String email,String password){
        userEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        loginButton.click();
    }/*
    public void takeScreenShot(WebDriver driver){
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File("src/test/ScreenShot/homePageScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }*/

}




