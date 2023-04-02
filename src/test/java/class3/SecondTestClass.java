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

public class SecondTestClass {

    WebDriver driver;

    @BeforeTest
    public void startEngine() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void logIn() {
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @AfterTest
    public void finishh() {

    }
}