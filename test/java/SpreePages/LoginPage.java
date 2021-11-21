package SpreePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public void login(WebDriver driver,String uemail,String password){
        WebElement email=driver.findElement(By.id("spree_user_email"));
        email.sendKeys(uemail);
        WebElement pwd=driver.findElement(By.cssSelector("input[type='password']"));
        pwd.sendKeys(password);
        driver.findElement(By.id("spree_user_remember_me")).click();
        driver.findElement(By.cssSelector("input[name='commit']")).click();

    }

}
