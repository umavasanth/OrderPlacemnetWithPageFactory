package SpreePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage {
    public void cartCheck(WebDriver driver){

        String total=driver.findElement(By.cssSelector("td[class='lead']")).getText();
        System.out.println("Total: " +total);
        //Assert.assertEquals(total,"$15.99");

    }
}
