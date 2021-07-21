package ExtendReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestDemo2 {
	
	static WebDriver driver ; 
	static ExtentReports report ;
	static ExtentTest test;
	
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\ExtendReport")+"\\ExtentReportResults.html",true);
     test = report.startTest("TestDemo2");
	}
	
  @Test
	  public void lunchbrowser() {
		  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Exe\\chromedriver.exe");
		
		driver = new ChromeDriver ();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.hotstar.com/in");
		
		if(driver.getTitle().equals("https://www.hotstar.com/in")) {
			test.log(LogStatus.PASS, "Navigate to specific URL");
			
		}
		else {
			test.log(LogStatus.FAIL, "Navigate to specific URL");
			
		}

}
  
  public void endTest() {
	  report.endTest(test);
	  report.flush();
	  
  }
}