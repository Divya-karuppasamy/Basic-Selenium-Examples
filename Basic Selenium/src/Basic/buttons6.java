package Basic;



import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import multiScreenShot.MultiScreenShot;

public class buttons6 {
	public static void main(String[]args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVYA\\Downloads\\selenium\\jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://leafground.com/home.html");
		
		//click button
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("home")).click();
		
		Robot robot=new Robot();
		Dimension screenshot=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenshot);
		BufferedImage source=robot.createScreenCapture(rectangle);
		File destination=new File("E://robot1.png");
		ImageIO.write(source, "png", destination);

		
		
		driver.navigate().back();
		
	//button position x y values	
	WebElement getposition=driver.findElement(By.id("position"));
	Point XYpoint=getposition.getLocation();
	int Xvalue=XYpoint.getX();
	int Yvalue=XYpoint.getY();
	System.out.println("xvalue is"+Xvalue+"yvalue is"+Yvalue);
	
	//button color
	WebElement getcolor=driver.findElement(By.id("color"));
	String color=getcolor.getCssValue("background-color");
	System.out.println("background color is "+color);
	
	
	//button height&weight
	WebElement sizeofbutton=driver.findElement(By.id("size"));
	int height=sizeofbutton.getSize().getHeight();
	int weight=sizeofbutton.getSize().getWidth();
	System.out.println("hight is "+height);
	System.out.println("weight is "+weight);
	
	}

}
