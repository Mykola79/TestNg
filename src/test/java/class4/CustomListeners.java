package class4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;



public class CustomListeners implements ITestListener {

    public void onStart(ITestContext arg){
        System.out.println("Starts test execution ........."+arg.getName());}

        public void onFinish(ITestContext arg){
            System.out.println("Starts test execution ........."+arg.getName());
    }
    public void onTestStart(ITestResult arg){
        System.out.println("starts test ....."+arg.getName());
    }
    public void onTestSkipped(ITestResult arg){
        System.out.println("skipped test ....."+arg.getName());}

    public void onTestSuccess(ITestResult arg){
        System.out.println("test passed ....."+arg.getName());}

    public void onTestFailure(ITestResult arg){
        System.out.println("test failed....."+arg.getName());}

}
