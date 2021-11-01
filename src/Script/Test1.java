package Script;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import Base.Base;
import POM.HomePage;

public class Test1 extends Base{
	
	
	public static void main(String[] args)throws MalformedURLException, InterruptedException {
		
	
		WebDriver	driver=LaunchBrowser();
	
	
	
	
	HomePage  h = new HomePage(driver);
	
	//		h.clickonMobile();
		
			h.VerifyWelcomeMsg();
			
			h.VerifyMagnetoIconalongwithImage();
			
			h.verifyMobileLink();
			
			h.verifyTVLink();
			
			h.verifyBackgrouOnMouseOvering(driver);
			
			Thread.sleep(4000);
			driver.close();	
	

	 
	
	

	
	
	
	
	
	
	}
	

}
