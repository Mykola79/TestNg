package class2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertAllExample {
    @Test(priority = 0)
    public void softAssert() {

        SoftAssert as = new SoftAssert();

        System.out.println("Start");

        as.assertFalse(false);
        System.out.println("End");
        as.assertAll();
    }

    @Test(priority = 1)
    public void hardTest() {
        System.out.println("Start");

        Assert.assertTrue(false);

        System.out.println("Finish");
    }
}
