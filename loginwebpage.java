package javaseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class loginwebpage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("login_field"));
		e1.sendKeys("kiranoruganti");
		WebElement e2 =driver.findElement(By.id("password"));
		e2.sendKeys("kiran@54726");
		WebElement login =driver.findElement(By.name("commit"));
		login.click();
	}
	
}






























//package javaseleniumpackage;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class acesswebelements1 {
//	public static void main (String args[]) throws Exception
//	
//	{
//	 // this throws an error thats y exception
//	 WebDriver driver =new ChromeDriver();
//	 driver.get("https://github.com/login");
//	 Thread.sleep(3000);
//	
//	}
//	
//	
//	// this is javascript code  
//	public static void highlight(WebDriver driver, WebElement element)
//	
//	{
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
//	}
//
//
//
//}
