package javaseleniumpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//
public class acesswebelementsusing8locators {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);// waits three seconds	
		highlight(driver, driver.findElement(By.id("login_field")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.name("password")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.className("header-logo")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.partialLinkText("Create an")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.tagName("h1")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));		
	}
	
	
	// this code is just to hightlight our webelements
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:red')", element);
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
