package Basic;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import multiScreenShot.MultiScreenShot;

public class Dropdown7 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVYA\\Downloads\\selenium\\jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		

		WebElement dropdown1= driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropdown1);
		select.selectByIndex(1);

		Thread.sleep(3000);
		WebElement dropdown2= driver.findElement(By.name("dropdown2"));
		Select select2=new Select(dropdown2);
		select2.selectByValue("2");

		Thread.sleep(3000);
		WebElement dropdown3=driver.findElement(By.id("dropdown3"));
		Select select3=new Select(dropdown3);
		select3.selectByVisibleText("UFT/QTP");

		
		  Thread.sleep(3000); 
		driver.findElement(By.className("dropdown"));
		List<WebElement> listof=select.getOptions();
		System.out.println(listof);
		
		
		  
		 

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Loadrunner");

		WebElement multiplech=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select select4=new Select(multiplech);
		select4.selectByIndex(1);
		select4.selectByIndex(2);
		select4.selectByIndex(3);
		select4.selectByIndex(4);



	}

}
