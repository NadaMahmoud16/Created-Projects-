package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BaseTest {

    protected WebDriver driver;
    protected static ExtentReports report;
    protected static ExtentTest reportTest;

    @BeforeSuite
    public void beforeSuite(){
        report = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(new File("Reports/report.html"));
        report.attachReporter(spark);
    }

    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @AfterSuite
    public void afterSuit() throws IOException {
        report.flush();
        Desktop.getDesktop().open(new File("Reports/report.html"));
    }
}

