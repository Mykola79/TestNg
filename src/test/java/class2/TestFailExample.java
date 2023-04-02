package class2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailExample {
    @Test

    public void testCaseFail() {

        Assert.fail("test purpose");
        System.out.println("test case failed");
    }
}
