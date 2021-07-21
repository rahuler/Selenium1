package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colour {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Exe\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		
	//	String abc = driver.findElement(By.xpath("//img[@id='logo' and @alt='logo']")).getCssValue("colour");
	//	System.out.println(abc);
		
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		WebElement parent = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		
		driver.switchTo().frame(parent);
		
		WebElement child = driver.findElement(By.xpath("//div[@class='row']/iframe"));
		
		driver.switchTo().frame(child);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc2");
		
		driver.switchTo().defaultContent();

	
	}

}
