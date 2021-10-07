package ScreenshotFailAndRetry;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTests implements IRetryAnalyzer {
    private int retryNumber = 0;
    private static int maxRetries = 3;
    @Override
    public boolean retry(ITestResult result) {
        if (retryNumber < maxRetries) {
            retryNumber++;
            return true;
        }
        return false;
    }
}
