package script;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeSuite()
	public void testBeforeSuite() {
		Reporter.log("Suite Starts",false);
	}
	@BeforeTest
	public void testBeforetest() {
		Reporter.log("Test Starts",true);
	}
	@BeforeClass
	public void testBrforeClass() {
		Reporter.log("Test Class Starts",true);
	}
	@BeforeMethod
	public void testBrforeMethod() {
		Reporter.log("Method Starts",true);
	}
	@Test(priority=1)
	public void test() {
		Reporter.log("Test Starts",true);
	}
	@AfterMethod
	public void testAfterMethod() {
		Reporter.log("Method Ends",true);
	}
	@AfterClass
	public void testAfterClass() {
		Reporter.log("Test Class Ends",true);
	}
	@AfterTest
	public void testAfterTest() {
		Reporter.log("Test Ends",true);
	}
	@AfterSuite
	public void testAfterSuite() {
		Reporter.log("Suite Ends",true);
	}
	
	
}
