package class2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueExample {
    @Test
    public void compareNumeric() {

        Assert.assertTrue(5 > 2);

        System.out.println("5 is greater");
    }

    @Test
    public void compareString() {
        Assert.assertTrue("Java".equals("Java"), "Not matched");
        Assert.assertTrue("Selenium".equals("Java"), "Not matched");
    }
}
