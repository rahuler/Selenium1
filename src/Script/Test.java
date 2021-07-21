package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Base;
import POM.HomePage;



public class Test  {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Exe\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver ();
				driver.manage().window().maximize();
			    driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("https://live.demoguru99.com/index.php");
				
				String title = driver.getTitle();
				System.out.println("Print the page title :"+ title);
				
		
				
			HomePage  h = new HomePage(driver);
	//		h.clickonMobile();
		
			h.VerifyWelcomeMsg();
			
			h.VerifyMagnetoIconalongwithImage();
			
			h.verifyMobileLink();
			
			h.verifyTVLink();
			
			h.verifyBackgrouOnMouseOvering(driver);
			
			Thread.sleep(4000);
			driver.close();	
		
				
				
				

}}
