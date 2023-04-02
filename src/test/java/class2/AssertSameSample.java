package class2;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSameSample {
    @Test(priority = 0)

    public void testCaseOne() {
        String str1 = "Hello";
        String str2 = "Hello";

        Assert.assertSame(str1, str2, "Not same");

        System.out.println("Successful");
    }

    @Test(priority = 1)
    public void testCaseTwo() {
        String s1 = "Java";
        String s2 = new String("Java");

        Assert.assertEquals(s1, s2, "Not same");
        System.out.println("Failure");
    }

    @Test(priority = 2)
    public void testCaseThree() {

        String s1 = "Java";
        String s2 = new String("Java");

        Assert.assertSame(s1, s2, "Not same");
        System.out.println("Success");
    }
}
