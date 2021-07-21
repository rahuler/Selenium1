
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestDemo {
	
	@Test
	public void m1() {
		System.out.println("M1");
		}
	
	@Test
    public void m2() {
    	Assert.assertEquals(true, false);
    	System.out.println("Test");	
	}

	@Test
    public void m3() {
		Assert.assertEquals(true, false);
    	System.out.println("AfterTest");
    	}
  }
