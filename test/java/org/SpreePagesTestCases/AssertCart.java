package org.SpreePagesTestCases;

import SpreePages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertCart {
    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","src/test/driver/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Test
    public void CartCheck() throws InterruptedException {

        LoginPage loginPage=new LoginPage();
        HomePage homePage=new HomePage();
        CategoryPage categoryPage=new CategoryPage();
        ProductPage productPage=new ProductPage();
        CartPage cartPage=new CartPage();
        loginPage.login(driver,"testmail1@test.com","123457$$");
        homePage.verifyHomePage(driver);
        categoryPage.SearchByCategory(driver);
        productPage.productDetails(driver);
        cartPage.cartCheck(driver);

         }
        @AfterMethod
        public void Close(){
        driver.quit();
    }

}
