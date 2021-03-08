package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVYA\\Downloads\\selenium\\jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/login");

		WebElement  username=driver.findElement(By.name("username"));
		username.sendKeys("user@phptravels.com");


		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement login=driver.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn-block loginbtn']"));
		login.click();

		WebElement profile=driver.findElement(By.xpath("//*[@class='menu-vertical-01']//li[2]/a"));
		profile.click();

	}

}
