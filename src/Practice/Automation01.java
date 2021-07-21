package Practice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation01 {
	
	public static void main(String[] args){
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Exe\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/");
		
		
		driver.findElement(By.id("enterimg")).click();
		

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


driver.switchTo().frame("aswift_2");


if(driver.findElement(By.xpath("//div[@style='cursor: pointer;']")) !=null) {
	driver.findElement(By.xpath("//div[@style='cursor: pointer;']")).click();
	
}
//driver.findElement(By.xpath("//div[@id='dismiss-button']"));
else {
	
	 WebElement advertisment = driver.findElement(By.xpath("//iframe[@title='Advertisement']"));
	 String title1 = advertisment.getAttribute("title");
		System.out.println(title1);
		 driver.switchTo().frame(advertisment);
		 driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
	
}
	
	
	/*
		if( ) { 
			
			System.out.println("Enter in child frame");
			
			driver.findElement(By.xpath("//div[@id='dismiss-button' and @class='ns-onih0-e-19 button-common close-button']")).click();
			
			   List<WebElement> element1 =driver.findElements(By.tagName("span"));
			  
			  for(int i= 0 ; i<=element1.size(); i++) {
				  
				  String text = element1.get(i).getText();
				  if(text.contains("close")) {
					  
					  element1.get(i).click();
				  }
				  
			  }
		}
		else {
			System.out.println("Click on parent");
			driver.findElement(By.xpath("//div[@style='cursor: pointer;']")).click();
			
		}
}
catch(NoSuchElementException e){
	 System.err.println(e);	 
}	
*/


WebElement dismiss = driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]"));
String dismisstext = dismiss.getText();

if(dismisstext.contains("click the button to display an alert box:")) {
	 
	 dismiss.click();	 
 }
			
   Alert alerttext = driver.switchTo().alert();
	String text = alerttext.getText();
	System.out.println(text);
	alerttext.accept();
	
	driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();

//	driver.findElement(By.xpath("//button[contains(text(),'//div[@id='Textbox']/p')]")).clear();
	//driver.findElement(By.className("promptbox()"))
	Alert alert2 = driver.switchTo().alert();

	alert2.sendKeys("Rahul is user");
	String text6 = alert2.getText();
	// alert2.sendKeys(text6.concat("Rahul kumar software"));
	// System.out.println(alert2);
	alert2.accept();
	String text5 = driver.findElement(By.xpath("//div[@id='Textbox']/p")).getText();
	System.out.println(text5);
	
		
	}

}
