package Basic;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import multiScreenShot.MultiScreenShot;

public class entersearchtarm3 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVYA\\Downloads\\selenium\\jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		 MultiScreenShot multiScreens=new MultiScreenShot("E:\\robot\\Screen\\", "entersearchtarm3");
		 multiScreens.multiScreenShot(driver);
		 
		 Thread.sleep(3000);
		
		WebElement enter=driver.findElement(By.name("q"));
		enter.sendKeys("agni"+Keys.ENTER);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("Window.Scroll(0,40)","enter");
		Thread.sleep(4000);
		 multiScreens.multiScreenShot(driver);
			
		
		
	}

}
