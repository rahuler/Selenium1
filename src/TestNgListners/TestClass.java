package TestNgListners;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenerTest.class)
public class TestClass extends Base {
	
	@BeforeTest
	public void m1() {
		launchbrowser();
		System.out.println("m1 succesfully Print");	
	}
	
	
	@Test
	public void m2() {
		Assert.assertEquals(true, false);
		System.out.println("m2 succesfully Print");
			
	}
	
	@AfterMethod
	public void closebrowser(){
		driver.quit();
		}



	
	
}
