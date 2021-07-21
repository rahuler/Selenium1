package TestNgListners1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenersTest.class)
public class TestClass extends Base{
	@BeforeTest
	public void m1() {
		launchbrowser();
		System.out.println("m1 succesfully Print");	
	}
	
	@AfterMethod
	public void closebrowser(){
		System.out.println("Successfully close");
		driver.quit();
		}

	@Test
	public void m2() {
		Assert.assertEquals(false, true);
		System.out.println("m2 succesfully Print");		
	}
	
	@Test
	public void m3() {
		Assert.assertEquals(true,false);
		System.out.println("m3 succesfully Print");		
	}
	
	
	
	
	

}
