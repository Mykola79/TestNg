package class4;

import org.testng.annotations.*;

public class Annotations2 {
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }
    @BeforeClass
    public void beforClass(){
        System.out.println("before class");
    }
    @BeforeMethod
    public void before(){
        System.out.println("i am before Method");
    }
    @AfterMethod
    public void after(){
        System.out.println("i am after Method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }
    @Test
    public void TestA(){
        System.out.println("i am test A");
    }
    @Test
    public void TestB(){
        System.out.println("i am test B");
    }}