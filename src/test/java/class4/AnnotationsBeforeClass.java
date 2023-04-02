package class4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsBeforeClass {
    @BeforeClass
    public void heelo(){
        System.out.println("before class");
    }
    @Test
    public void testB(){
        System.out.println("testB");
    }
}
