package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {
	  
	 String url ;
	 //String Pass;
	public static String read(String url ) throws FileNotFoundException {
		
		
		FileInputStream fs= new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\Property.config"); 
		
		Properties p = new Properties();
		
		try {
			p.load(fs);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		   url = p.getProperty("url");
		 
	String	Pass = p.getProperty("password");
		  
		 System.out.println(url);
		 
		
	
		return (url) ;
		
	}

}
