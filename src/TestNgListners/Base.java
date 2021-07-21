package TestNgListners;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Base {
	
	static WebDriver driver; 
	
	@Test
	
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
	}
		
	@Test
	public  static void failed(WebDriver driver, String filename ) {
		EventFiringWebDriver Event= new EventFiringWebDriver(driver);
		 File src = Event.getScreenshotAs(OutputType.FILE);
	
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Screenshot"+filename+".png");
		try {
			FileUtils.copyFile(src , f);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
		
		
		
		
		
		

}
