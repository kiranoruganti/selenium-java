package javaseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basiccontrols {
	public static void main (String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//maximizes the window size
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		//textbox
		WebElement e1=driver.findElement(By.id("firstName"));
		e1.sendKeys("abcd");
		
		//radiobutton
		WebElement radiobutton=driver.findElement(By.id("malerb"));
		radiobutton.click();
		
		//checkbox
		WebElement checkbox1=driver.findElement(By.id("englishchbx"));
		checkbox1.click();
		
		WebElement checkbox2=driver.findElement(By.id("hindichbx"));
		checkbox2.click();
		Thread.sleep(1000);//waits 1 sec
		
//		System.out.println("The checkbox is selection state is - " + checkbox1.isSelected());
		
		//button
		WebElement register=driver.findElement(By.id("registerbtn"));
		register.click();
		
		//link 
		WebElement hyperlink =driver.findElement(By.linkText("Click here to navigate to the home page"));
		hyperlink.click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	
		
	}

}
