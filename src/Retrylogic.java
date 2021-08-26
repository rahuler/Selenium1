import org.testng.Assert;
import org.testng.annotations.Test;

public class Retrylogic {
	
@Test()
	
	public void Test1() {
		
		Assert.assertEquals(true, false);
		
	}
	
  @Test()
	
	public void Test2() {
		Assert.assertEquals(true, true);
		
	}
	


}
