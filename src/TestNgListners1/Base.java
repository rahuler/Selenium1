package TestNgListners1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.Reporter;


public class Base {
	
	public static WebDriver driver; 
	
	
public static void launchbrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Exe\\chromedriver.exe");
		
		driver = new ChromeDriver ();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.hotstar.com/in");
		
		String Acturl = driver.getCurrentUrl();
		Assert.assertEquals(Acturl, "https://www.hotstar.com/in");
		Reporter.log("launchbrowser", true);
	}
		
    
	public void failed(String TestMethod){
		//EventFiringWebDriver Event= new EventFiringWebDriver(driver);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	//	File src = Event.getScreenshotAs(OutputType.FILE);
		
		try {
			//FileUtils.copyFile(src,new File("C://Users//DELL//eclipse-workspace//Selenium1"+"//Screenshots//onTestFailure.png"));
			FileUtils.copyFile(src,new File("C://Users//DELL//eclipse-workspace//Selenium1"+"//Screenshots//"+TestMethod+"-"+".jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
		
		
		
		
		
		

}
