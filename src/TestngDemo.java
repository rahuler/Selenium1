import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestngDemo {
	
	 static WebDriver  driver;
	 
		@Test(priority=1)
	    
	   @Parameters({"url"})
		
	   public  void openbrowser(String url) {
			
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Exe\\chromedriver.exe"); 
	     driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   driver.get(url);
	 String CurrentURL1 = driver.getCurrentUrl();
	 Assert.assertTrue(CurrentURL1.contains("https://www.hotstar.com/")); 
		}
	    
	   @Test(priority=2)
	  public void closeapp() {
		  driver.quit();
	  }
	  
	  

}
