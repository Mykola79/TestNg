package class2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseExample {
    @Test

    public void compareNumeric() {
        Assert.assertFalse(5 > 2);
        System.out.println("5 is greater");
    }

    @Test
    public void compareString() {

        Assert.assertFalse("Selenium" == "Java", "Matched");
    }
}
