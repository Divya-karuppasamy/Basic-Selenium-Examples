package Basic;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class opengoogle1
 {
	public static void main(String[] args) throws IOException  {
		WebDriver driver = null;

		FileInputStream stream=new FileInputStream("config.properties");
		Properties properties=new Properties();
		properties.load(stream);
		
		String browser=properties.getProperty("Browser");
		String location=properties.getProperty("driverlocation");
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",location);
			 driver=new ChromeDriver();
				
		}
		
		
		driver.get("http://www.google.com/");
		
		
		
			}

}
