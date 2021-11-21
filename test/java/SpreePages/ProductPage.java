package SpreePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    public void productDetails(WebDriver driver){
        driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys("1");
        driver.findElement(By.id("add-to-cart-button")).click();

    }


}
