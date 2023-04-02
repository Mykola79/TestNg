package class1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNGExampleAnotation {

    public static WebDriver driver;//now WebDriver is global

    //http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login

    @BeforeMethod(alwaysRun = true)
    public void SetupBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test(groups = "regression")
    public void loginFunctionality() {
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");

        WebElement password2 = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password2.sendKeys("Hum@nhrm123");

        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        loginBtn.click();
    }

    @Test
    public void passwordTextBoxVerification() {
        WebElement password2 = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        System.out.println(password2.isDisplayed());
    }
}
