package class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstClassTest {

    WebDriver driver;

    @BeforeTest
    public void startBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testLogo() {
        WebElement logo = driver.findElement(By.xpath("//*[@id='divLogo']/img"));

        System.out.println(logo.isDisplayed());

        Assert.assertTrue(logo.isDisplayed());
    }

    @Test
    public void pageTitle() {
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @AfterTest
    public void finishh() {
        //driver.close();
    }
}




