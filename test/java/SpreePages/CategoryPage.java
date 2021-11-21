package SpreePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CategoryPage {

    public void SearchByCategory(WebDriver driver){
        WebElement dropdown=driver.findElement(By.id("taxon"));
        Select sel=new Select(dropdown);
        sel.selectByValue("1");

        driver.findElement(By.cssSelector("input[value='Search']")).click();
        driver.findElement(By.cssSelector("span[title='Ruby on Rails Tote']")).click();

    }
}
