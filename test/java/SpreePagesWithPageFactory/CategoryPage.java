package SpreePagesWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {

    @FindBy(linkText ="Bags")
    private WebElement category;

    @FindBy(css = "span[title='Ruby on Rails Tote']")
    private WebElement product;

    public CategoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectCategory(){
        category.click();
    }
    public void selectProduct(){
        product.click();
    }
}
