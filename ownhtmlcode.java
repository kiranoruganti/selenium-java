package javaseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ownhtmlcode {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
//		driver.get("D:\\software testing\\dropdown.html");
		driver.get("file:///D:/software%20testing/dropdown.html");
		
		driver.manage().window().maximize();
		
		
		
		WebElement dropdown_d=driver.findElement(By.id("listitems"));
		
		//by visible text
		Select study =new Select(dropdown_d);
		study.selectByVisibleText("Inter");
		
		//by index
		study.selectByIndex(3);
		
		
		
	}
}

