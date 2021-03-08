package waits;


import java.time.Duration;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVYA\\Downloads\\selenium\\jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.phptravels.net/login");

		WebElement  username=driver.findElement(By.name("username"));
		username.sendKeys("user@phptravels.com");


		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement login=driver.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn-block loginbtn']"));
		login.click();

		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		
		/*
		 * Wait<WebDriver> wait=new FluentWait<WebDriver>(driver) .withTimeout(30,
		 * TimeUnit.SECONDS) .pollingEvery(3, TimeUnit.SECONDS)
		 * .ignoring(NoSuchElementException.class);
		 */  
WebElement profile=wait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver driver)
		{
			return driver.findElement(By.xpath("//*[@class='menu-vertical-01']//li[2]/a"));
			
			
		}
});
	profile.click();
	
	
	}

}
