package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirefox2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DIVYA\\Downloads\\selenium\\jar\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		
	}

}
