package javaseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class accesswebelements {
	public static void main(String argsp[]) throws Exception //if we write thread we should throw an Exception
	{
		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		WebElement e1 =driver.findElement(By.id("yschsp"));
		e1.sendKeys("hi mawa how are you 3 seconds la nen close aitha kavalante count chesko?");
		Thread.sleep(3000);// waits 3 seconds and then closes the page
		driver.close();
		
		
		
		
			
	}
}
