package org.VapasiPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;


    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/driver/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
