package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation03 {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Exe\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/");
		
		String Purl = driver.getCurrentUrl();
		System.out.println("parent URL:="+Purl);
		
		
		driver.findElement(By.id("enterimg")).click();
		

		 WebElement element = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
		 
		 Actions a = new Actions(driver);
		 a.moveToElement(element).perform();
		 
		 driver.findElement(By.xpath("//a[text()='Windows']")).click();
		 
		 driver.switchTo().frame("aswift_2");
		 
		 try {
		
			 if(driver.findElement(By.xpath("//div[@style='cursor: pointer;']")).isEnabled()) {
				 
				 driver.findElement(By.xpath("//div[@style='cursor: pointer;']")).click();
				 
			 }
		
			 else { 
				
				 System.out.println("Unable to navigate to frame with element ");
				 
				 WebElement advertisment = driver.findElement(By.xpath("//iframe[@title='Advertisement']"));
				 String title1 = advertisment.getAttribute("title");
					System.out.println(title1);
				//	 driver.switchTo().frame(advertisment);
					 driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
			 }
			 
		
		 }catch(NoSuchElementException e ) {
			 
			 System.out.println("Unable to locate element" + e.getStackTrace());
			 
		 }catch(NoSuchFrameException e) {
			 
			 System.out.println("Unable to locate frame with element" + e.getStackTrace());
		 }
		 
		 
		 catch(StaleElementReferenceException e){
			 
			 System.out.println("Unable to locate frame with element" + e.getStackTrace());
			 
		 }
		catch(Exception e) {
			System.out.println("Unable to locate frame with element" + e.getStackTrace());
		}
		 
		 
		
		 
		 WebElement abcclick = driver.findElement(By.xpath("//a//button[contains(text(),'click')]"));
		 abcclick .click();
		  
		Set<String> win = driver.getWindowHandles();
		
		Iterator<String> itr = win.iterator();
		String parent = itr.next();
		String child = itr.next();
		driver.switchTo().window(child);
		 driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys("hbabjsj");
		 String url = driver.getCurrentUrl();
		 
		 System.out.println("child url:="+url);
		 
		driver.close();
		
		driver.switchTo().window(parent);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
		 driver.findElement(By.xpath("//div[@id='Multiple']//button[contains(text(),'click')]")) .click();
		
		Set<String> wind2 = driver.getWindowHandles();
		
		List al = new LinkedList(wind2);
		al.remove(0);
		int count = al.size();
		
		System.out.println("list count:="+count);
		System.out.println("window count:"+al);
		
		Iterator<String> itr2 = wind2.iterator();
		
		String parent1 = itr2.next();
		
		String child1 = itr2.next();
		String child2 = itr2.next();
		
		
		
		
	}

	

}
