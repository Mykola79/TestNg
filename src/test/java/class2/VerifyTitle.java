package class2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VerifyTitle {

    public static WebDriver driver;

    @BeforeClass
    public void SetupBrowser() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        driver = new ChromeDriver();
        String URL = "https://www.google.com";
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void verifyTitle() {

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        Assert.assertEquals(actualTitle, "Google");
        System.out.println("matched");
    }

    @Test
    public void verifyTitle2() {
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "Gooogle", "Not matched");

    }

    @AfterMethod
    public void close() {
        driver.close();
    }
}
