package SpreePagesWithPageFactory;

import org.VapasiPro.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    }

}




