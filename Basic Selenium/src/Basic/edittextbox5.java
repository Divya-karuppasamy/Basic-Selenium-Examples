package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class edittextbox5 {
	 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVYA\\Downloads\\selenium\\jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/home.html");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a")).click();
	
		//textbox enable irruka illanu paga 
		WebElement textbox=driver.findElement(By.id("email"));
		Boolean disable=textbox.isEnabled();
		System.out.println("the text is enable " +disable);
		
		//values send pananu oru text box la 
		 WebElement emailbox=driver.findElement(By.id("email"));
		 emailbox.sendKeys("divyakaruppasamy@gmail.com");
		
		 //oru text irrukum athuku pagathulaye innuru text eluthanu
		 WebElement append=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		 append.sendKeys("text");
	 
	 //irrukura text eduka
	 WebElement getvalue=driver.findElement(By.name("username"));
	 String values=getvalue.getAttribute("value");
	 System.out.println(values);
	 
	 //text clear pana
	 WebElement cleartext=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	 cleartext.clear();
	 
	 //box enable irrukanu pathurukom 
	 WebElement disablebox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
	 Boolean enable=disablebox.isEnabled();
	 System.out.println("the box is enable "+enable);
	 
	 
	 }
}
