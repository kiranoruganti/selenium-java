package javaseleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdrownlist {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		//single select dropdown
		WebElement coursenameElement= driver.findElement(By.id("course"));
		
		Select coursename_dd= new Select(coursenameElement);
		coursename_dd.selectByIndex(1);// selects java becuz java index 1 (index starts with 0)
		
		Thread.sleep(2000);
		
		coursename_dd.selectByValue("python");
		
		Thread.sleep(1000);
		
		coursename_dd.selectByVisibleText("Javascript");
		
		Thread.sleep(1000);
		
		coursename_dd.selectByIndex(0);// deselect javscript and selects 0 we cannot use the deselect options we use in multi dropdrown
		Thread.sleep(2000);
		//multi selection dropdown
		
		WebElement ide_name =driver.findElement(By.id("ide"));
		
		Select ide_dd =new Select(ide_name);
		
		ide_dd.selectByIndex(0);
		Thread.sleep(1000);
		
		ide_dd.selectByValue("ij");
		Thread.sleep(1000);
		ide_dd.selectByValue("nb");
		Thread.sleep(1000);
		
		ide_dd.selectByVisibleText("Visual Studio");
		Thread.sleep(1000);
	
		
		//deselecting single and multi selection dropdown
		

		
		ide_dd.deselectByIndex(0);//deselects eclipse
		Thread.sleep(1000);
		
		ide_dd.deselectByVisibleText("Visual Studio");
		Thread.sleep(1000);
		
		ide_dd.deselectByValue("ij");
		Thread.sleep(1000);
		
		ide_dd.deselectAll();//deselects everything
		
		ide_dd.selectByVisibleText("Visual Studio");
		Thread.sleep(1000);
		
		
		//get method
		
		 List<WebElement>coursesAvailable=coursename_dd.getOptions();
		 System.out.print("courses available::");
		 
		 for(WebElement webElement:coursesAvailable)
		 {
			 System.out.println(webElement.getText());
		 }
		
		 System.out.println();
		 
		 List<WebElement>idesselected=ide_dd.getOptions();
		 System.out.print("courses available::");
		 
		 for(WebElement webElement:idesselected)
		 {
			 System.out.println(webElement.getText());
		 }
		
		
		System.out.println("SelectedOption::");
		System.out.println(ide_dd.getFirstSelectedOption().getText());
		
		driver.close();		
		
		
	}
}
