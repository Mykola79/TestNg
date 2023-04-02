package class1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class classNGAnnotations {

    @BeforeMethod
    public void beforeMethods() {
        System.out.println("before Method");
    }

    @Test(groups = "regression")
    public void aFirstTestCase() {
        System.out.println("i am the first case test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }

    @Test
    public void bSecondTestcase() {
        System.out.println("second case");
    }

    @Test
    public void cThirdTestCase() {
        System.out.println("third case");
    }
}
