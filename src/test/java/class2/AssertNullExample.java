package class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullExample {
    @Test

    public void testCase() {

        WebDriver driver = new ChromeDriver();
        Assert.assertNotNull(driver);
        System.out.println("Success");
    }
}
