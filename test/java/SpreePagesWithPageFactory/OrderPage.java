package SpreePagesWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrderPage {



    @FindBy(css = "div.alert.alert-notice")
    private WebElement orderSuccessMessage;

    @FindBy(css = "#order_summary>h1")
    private WebElement orderId;

    public OrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String verifyOrderSuccessMessage(){

         String orderalertnotice=orderSuccessMessage.getText();
         return orderalertnotice;


    }
    public String verifyOrderId(){
        String orderno=orderId.getText();
       return orderno;


    }
}
