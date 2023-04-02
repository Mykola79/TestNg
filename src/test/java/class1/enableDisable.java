package class1;

import org.testng.annotations.Test;

public class enableDisable {
    @Test(enabled = false)
    public void Atest() {
        System.out.println("first case");
    }


    @Test
    public void Btest() {
        System.out.println("second case");
    }

    @Test
    public void Ctest() {
        System.out.println("third case");

    }
}