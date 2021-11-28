package SpreePagesWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage {

    @FindBy(css = "td[class='lead']")
    private WebElement cartDetails;

    @FindBy(id = "checkout-link")
    private WebElement checkOutBtn;


    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getCartDetails() throws InterruptedException {
        Thread.sleep(2000);
        String total=cartDetails.getText();
        return total;



    }
    public void clickCheckOut() throws InterruptedException {
        checkOutBtn.click();
        Thread.sleep(3000);
    }

}
