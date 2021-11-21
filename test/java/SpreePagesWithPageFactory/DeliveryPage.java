package SpreePagesWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage {

    @FindBy(css = "input[data-cost='$5.00']")
    private WebElement upsGround;

    @FindBy(css = "input[name='commit']")
    private WebElement deliverySaveButton;

    public DeliveryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void selectUPSGround(){
        upsGround.click();
    }
    public void saveDelivery() throws InterruptedException {
        deliverySaveButton.click();
        Thread.sleep(2000);
    }
}
