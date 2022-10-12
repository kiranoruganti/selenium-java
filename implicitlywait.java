package javaseleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.*;
//import orq.openqa.selenium.chrome.ChromeDriver;

public class implicitlywait {
	
	public static void main(String args[])
	{

		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html?m=1");
		WebElement e2= driver.findElement(By.id("btn1"));
		e2.click();
		WebElement text=driver.findElement(By.id("txt1"));
			text.sendKeys("hi i am kiran");
		
	
	
}
}
