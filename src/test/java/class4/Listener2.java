package class4;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener2 implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("the test case has passed "+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("the test case has failed "+result.getName());
    }
}
