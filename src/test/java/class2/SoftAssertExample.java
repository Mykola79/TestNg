package class2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test(priority = 0)

    public void softAssert() {

        SoftAssert sa = new SoftAssert();
        System.out.println("Start");

        sa.assertTrue(false);
        System.out.println("End");

    }

    @Test(priority = 1)
    public void hardAssert() {

        System.out.println("Start");

        Assert.assertTrue(false);
        System.out.println("End");

    }
}
