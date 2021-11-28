package org.SpreePagesTestCases;


//import com.relevantcodes.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    public ExtentReports extent;

    @BeforeClass(alwaysRun = true)
    public void initExtentReport(){
        ExtentSparkReporter reporter=new ExtentSparkReporter("src/test/Reports/report.html");
        reporter.config().setDocumentTitle("Spree Project");
        reporter.config().setReportName("Check out functionality");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.flush();


    }

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        if (ITestResult.FAILURE == result.getStatus()) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(screenshot, new File("src/test/ScreenShot/homePageScreenshot.png"));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
            driver.close();

        }
    }


