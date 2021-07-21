package ExtendReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestDemo {

	public static WebDriver driver; 
	static ExtentReports report;
	static ExtentTest Test1;
	
	@BeforeClass
    public static void startTest()throws ClassNotFoundException{
	
	 //report = new ExtentReports(System.getProperty("C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\ExtendReport")+"\\ExtentReportResults.html", true);
		
		report = new ExtentReports("C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\ExtendReport"+"\\ExtentReportResults.html", true);
		
	  Test1 = report.startTest("TestDemo");
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
		String title = driver.getTitle();
		System.out.println(title);
		
		if(driver.getTitle().equals("Disney+ Hotstar - Watch TV Shows, Movies, Live Cricket Matches & News Online")) {
			
			Test1.log(LogStatus.PASS, "Navigate to specific URL");	
		}
		
		else {
			Test1.log(LogStatus.FAIL, "Test Failed");
		}
	
	}
	
	@AfterClass
	public void endTest() {
		
		report.endTest(Test1);
		report.flush();
	}
	
	@AfterClass(dependsOnMethods="endTest")
	public void closeBrowser() {
		
		driver.quit();	
	}
	

}
