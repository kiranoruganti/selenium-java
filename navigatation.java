package javaseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatation {
	
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement e1 =driver.findElement(By.name("q"));
		e1.sendKeys("kiran oruganti blogger website");
		e1.submit();
		driver.navigate().to("https://www.facebook.com");
//		Thread.sleep(2000);
		WebElement i1=driver.findElement(By.name("email"));
		i1.sendKeys("kiran54726");
		driver.navigate().refresh();
		
		WebElement i12=driver.findElement(By.name("email"));
		i12.sendKeys("kiran_oruganti");
		driver.navigate().back();
		driver.navigate().to("https://kiran54726.blogspot.com/");
		
		
		
		
		
	}

}