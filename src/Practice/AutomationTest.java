package Practice;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutomationTest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Exe\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/");
		driver.findElement(By.id("enterimg")).click();
		
		// selecting language in language dropdown
		
		WebDriverWait wb = new WebDriverWait(driver,20);
		wb.until(ExpectedConditions.elementToBeClickable(By.id("msdd")));
		
		WebElement msd = driver.findElement(By.id("msdd"));
		msd.click();
		
		List<WebElement> abc = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		
		for(int i = 0 ; i<abc.size(); i++) {
			String text = abc.get(i).getText();	
			if (text.contains("Hindi")|| text.contains("English") || text.contains("French")) {
				//abc.get(i).click();			
			}	
		}	
		
		// verifying language dropdown value
		
		List<WebElement> elemet = driver.findElements(By.xpath("//div[@id=\"msdd\"]//div"));
		for(int i =0 ; i< elemet.size(); i++) {
			String text1 = elemet.get(i).getText();
			System.out.println(text1);
			
		if (text1.contains("Hindi")|| text1.contains("English") || text1.contains("French")) {
			//if ((text1.contains("Hindi")) && (text1.contains("English")) && (text1.contains("French"))) {
				
				System.out.println("language dropdown verified");		
			}
		}
		
		// Selecting country from dropdown
		
		WebElement select1 = driver.findElement(By.id("countries"));
		Select s = new Select(select1);
		 s.selectByVisibleText("India");
		 
		// Verify country dropdown value		 
		String attributvalue = select1.getAttribute("value");
		
		Assert.assertEquals(attributvalue, "India");
			
		if(attributvalue.equals("India") ) {
			System.out.println("dropdown value verified");
		}
		
		WebElement Webelement1 = driver.findElement(By.xpath("//input[@type='password' and @id='firstpassword']"));
		Webelement1.sendKeys("12345");
		String abc2 = Webelement1.getAttribute("type");
		
		if(abc2.equals("password")) {
			
			System.out.println("Password is masked");
			
		}else{
			System.out.println("password is not masked");
			
		}
		
		 WebElement element = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
		 
		 Actions a = new Actions(driver);
		 a.moveToElement(element).perform();
		 
	     WebElement alert = driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
		
		 
		 if(alert.getText().equals("Alerts")) {
			 
			 alert.click();	 
		 }else {
			 System.out.println("not able to click on alert button");
		 }
		 
		  List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		  
		 int count = frame.size();
       System.out.println(count);

for(int i= 0 ; i<count; i++) {
	
	System.out.println(frame.get(i).getAttribute("id"));
	
}

 try {
	 
	 driver.switchTo().frame("aswift_2");
	 
	// driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
	 
	 /*
	 
	 WebElement advertisment = driver.findElement(By.xpath("//iframe[@title='Advertisement']"));
	 
	String title1 = advertisment.getAttribute("title");
	
	System.out.println(title1);
	
	 driver.switchTo().frame(advertisment);
	 
	// WebDriverWait wb1 = new WebDriverWait(driver,20); 
	// wb1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dismiss-button']")));
	/* 
	WebElement text4 = driver.findElement(By.xpath("//div[@id='dismiss-button']"));
	String attribute4 = text4.getAttribute("id");
	// System.out.println(attribute4+"yyyyyy");
	 // Advertisement
	 if(attribute4.equals("dismiss-button")) {
		 text4.click();
	 } 
	 
	 /*
	  * 
	  */
	 
	// driver.findElement(By.xpath("//iframe[@title='Advertisement']")).isEnabled();
		
		 
		 
		 WebElement advertisment = driver.findElement(By.xpath("//iframe[@title='Advertisement']"));
		 
			String title1 = advertisment.getAttribute("title");
			
			System.out.println(title1);
			WebDriver el = driver.switchTo().frame(advertisment);
			
		 if(driver.findElement(By.xpath("//div[@id='dismiss-button']")).isEnabled()==true) {
			 
			 driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
	 }
else {
	
	System.out.println("Invalid Advertisment popoup");
		//driver.switchTo().frame("aswift_2");
		// WebDriverWait wb1 = new WebDriverWait(driver,20); 
		// wb1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='cursor: pointer;']")));
		 driver.findElement(By.xpath("//div[@style='cursor: pointer;']")).click();	
	}
	  
 }catch(NoSuchElementException e){
	 System.err.println(e);	 
 }	 
 
 
 Thread.sleep(2000);
 
 WebElement dismiss = driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]"));
 String dismisstext = dismiss.getText();

 if(dismisstext.contains("click the button to display an alert box:")) {
	 
	 dismiss.click();	 
  }
			
    Alert alerttext = driver.switchTo().alert();
	String text = alerttext.getText();
	System.out.println(text);
	alerttext.accept();
	}

}
