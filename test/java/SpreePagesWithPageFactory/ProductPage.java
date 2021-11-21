package SpreePagesWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage {
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartBtn;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCart() throws InterruptedException {
        addToCartBtn.click();
        Thread.sleep(2000);
    }

}
