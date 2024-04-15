package tests;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ExtentReDemo {

ExtentReports extent;
ExtentSparkReporter spark;
@BeforeSuite
public void setUpReport(){
    extent = new ExtentReports();
    spark = new ExtentSparkReporter("reports.html");
    extent.attachReporter(spark);
}
@AfterSuite
public void tearDownReport(){
extent.flush();
}
}
