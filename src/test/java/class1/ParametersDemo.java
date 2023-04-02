package class1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
    WebDriver driver;

    @Parameters({"Browser"})
    @BeforeClass
    public void setupStart(String Browser) {
        WebDriverManager.chromedriver().setup();

        if (Browser.equalsIgnoreCase("Chrome")) {

            driver = new ChromeDriver();
            System.out.println("Chrome opened");
        }else {

            driver=new FirefoxDriver();
            System.out.println("firefox opened");
        }driver.manage().window().maximize();

    }


    @Parameters({"url"})
        @Test(priority = 1)
        public void getUrl (String url) {
        driver.get(url);


        }

        @Test(priority = 2)
        public void homeTitle () {
            String title = driver.getTitle();
            System.out.println(title);

        }

        @AfterClass
        public void tearDown () {
            driver.close();
        }

    }
