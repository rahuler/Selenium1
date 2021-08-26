package Script;



import org.testng.annotations.Test;

import Base.Base1;
import POM.HomePage;


public class HomepageTest extends Base1{
	

	@Test
	 public  void VerifyWelcomeMessage(){
		
		HomePage h = new HomePage(driver);
		
		  h.VerifyWelcomeMsg();
		
	}	
	/*
	@Test
	public void VerifyMagnetoIconwithImag() {
		
		h.VerifyMagnetoIconalongwithImage();
		
	}	 
	
	*/


}