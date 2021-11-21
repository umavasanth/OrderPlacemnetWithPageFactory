package SpreePagesWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

    @FindBy(css = "div.alert.alert-success")
    private WebElement sucessMessage;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void verifyMessage(){
       String loggedInMessage=sucessMessage.getText();
        Assert.assertEquals(loggedInMessage,"Logged in successfully");
        System.out.println(loggedInMessage);
    }
}


