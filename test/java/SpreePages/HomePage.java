package SpreePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePage {
    public void verifyHomePage(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        String logsuccess=driver.findElement(By.cssSelector("div.alert.alert-success")).getText();
        //Assert.assertEquals(logsuccess,"Logged in successfully");

    }
}
