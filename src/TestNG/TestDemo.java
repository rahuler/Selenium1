package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo {
	
	
	@BeforeTest
	public void m1() {
		
		System.out.println("Before Test succesfully Print");		
	}
	
	@AfterTest
	public void m2() {
		//Assert.assertEquals(true,false);
		System.out.println("After Test succesfully Print");		
	}
	
	@BeforeMethod
	public void m3() {
		//Assert.assertEquals(false, true);
		System.out.println("BeforeMethod");		
	}
	
	@Test
	public void m4() {
		//Assert.assertEquals(false,true);
		System.out.println("Test");		
	}
	
	
	@BeforeClass
	public void m5() {
		//Assert.assertEquals(false,true);
		System.out.println("Beforeclass");		
	}
	
	

}
