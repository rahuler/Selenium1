import org.testng.Assert;
import org.testng.annotations.Test;



public class RetryDemo {
	
	@Test(retryAnalyzer=Retry.MyRetry.class)
	
	public void Test1() {
		
		Assert.assertEquals(true, false);
		
	}
	
  @Test(retryAnalyzer=Retry.MyRetry.class)
	
	public void Test2() {
		Assert.assertEquals(true, false);
		
	}
	


}
