package class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertionExample {
    public static WebDriver driver;

    @BeforeMethod
    public void setupBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testCase() {
        WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();

        WebElement checkError = driver.findElement(By.xpath("//span[text()='Username cannot be empty']"));

        String actualError = checkError.getText();

        System.out.println(actualError);

        String expectedError = "Username cannot be empt";

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualError, expectedError);

        boolean disp = login.isDisplayed();

        System.out.println("login button is " + disp);

        soft.assertTrue(disp);

        soft.assertAll();
    }

    @AfterMethod
    public void finishText() {

        driver.close();
    }
}
