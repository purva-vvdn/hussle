import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.*;

public class TestReport {
    ExtentReports extent;
    ExtentTest test;

    @BeforeTest
    public void setup() {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @Test
    public void testPass() {
        test = extent.createTest("Test Case - Pass");
        test.pass("This test passed successfully.");
    }

    @Test
    public void testFail() {
        test = extent.createTest("Test Case - Fail");
        test.fail("This test failed.");
    }

    @AfterTest
    public void teardown() {
        extent.flush(); // Generates the report
    }
}
