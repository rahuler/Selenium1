package Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLink {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Exe\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		
		int count = alllink.size();
		System.out.println(count);
		
		for(WebElement link:alllink) {
			
			String url = link.getAttribute("href");
			//System.out.println(url);
			VerifyallActive(url);
			
		}
			
	}
	public static void VerifyallActive(String Linkurl) throws IOException {
		
		URL url;
		try {
			url = new URL(Linkurl);
			 HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			 connection.setConnectTimeout(50000);
			 connection.connect();
			if(connection.getResponseCode()==200) {
				
				System.out.println(Linkurl+"-"+connection.getResponseMessage());				
			}
			
			if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				
				System.out.println(Linkurl+"-"+connection.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
				
			}
		} catch (MalformedURLException e1) {
			
		}
	
	}

}
