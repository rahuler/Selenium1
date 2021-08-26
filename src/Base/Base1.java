package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class Base1 {
		public	WebDriver driver ;
		
		@BeforeMethod
		public  void LaunchBrowser() {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Exe\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver ();
				driver.manage().window().maximize();
			    driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("https://live.demoguru99.com/index.php");
			
				}
		

}		
