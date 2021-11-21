package SpreePagesWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    @FindBy(id = "order_payments_attributes__payment_method_id_3")
    private WebElement checkRadioButton;
    @FindBy(css = "input[name='commit']")
    private WebElement savePaymentPage;

    public PaymentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickRadioButton(){
        checkRadioButton.click();

    }
    public void clickPaymentPageSaveButton() throws InterruptedException {
        savePaymentPage.click();
        Thread.sleep(2000);
    }
}
