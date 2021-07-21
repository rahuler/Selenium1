package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Exe\\chromedriver.exe");
		
				
				WebDriver driver = new ChromeDriver ();
				driver.manage().window().maximize();
			    driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("http://demo.automationtesting.in/Register.html");
			    WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
			    Address.sendKeys("rahul");
			    Thread.sleep(2000);
			   String text = Address.getAttribute("value");
			    System.out.println(text);
			    
			    
			    WebElement emailID = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
			    emailID.sendKeys("Rahuler4@gmail.com");
			    String email = emailID.getAttribute("value");
			    System.out.println(email);
			    
			//	String text3 =Address.getAttribute("value");
			//	System.out.println("Entered Address is: " + text3);
		/*		
	
		  driver.findElement(By.xpath("//*[@ng-model='Adress']")).click();
		  driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(Keys.CONTROL+"a"); 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(Keys.CONTROL+"x"); 
		  WebElement display = driver.findElement(By.xpath("//*[@ng-model='Adress']"));
		  display.sendKeys("Finaaly I'm able to enter"); 
		  Thread.sleep(2000); 
		  String text1 = display.getAttribute("value");
		  System.out.println("Enter Address:=" + text1);
			    //Assert.assertEquals(text1, "Finaaly I'm able to enter");
			  
			 
		*/	    
			  
			    
				
				driver.close();
			}
			

		



}
