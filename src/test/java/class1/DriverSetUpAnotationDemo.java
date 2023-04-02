package class1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DriverSetUpAnotationDemo {
    WebDriver driver;

    @BeforeSuite
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeTest
    public void launchURL() {
        String url = "https://www.google.com";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void setGetTitle() {
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
    }


    @AfterTest
    public void testResult() throws IOException {
        //Put the code to take screenshot of test result.
        TakesScreenshot ss = (TakesScreenshot) driver;
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);
        File desFile = new File("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots.png");
        FileUtils.copyFile(sourceFile, desFile);
    }

    @AfterSuite
    public void closeDriver() {
        driver.close();
    }
}









