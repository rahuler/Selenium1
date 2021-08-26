package Script;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.Base;
import Base.Base1;
import POM.HomePage;

public class Test2 extends Base {
	

	@Test
	
	public void LaunchBrowserAnd() throws InterruptedException {
		
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
