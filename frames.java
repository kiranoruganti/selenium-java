package javaseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class frames {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Text1"); //Main document
//		Thread.sleep(5000);
		driver.switchTo().frame("frm1");
		Select courseName_dd= new Select(driver.findElement(By.id("course")));
		courseName_dd.selectByVisibleText("Java");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();// paina frame1 loki control poindi deafult frame or main frame povali ante we have to use  frames
		driver.findElement(By.id("name")).clear();// clears text1 code okavela clear cheyakpothe text1text2 ani apppend ayyi osthadi
		
		driver.findElement(By.id("name")).sendKeys("Text2");
		Thread.sleep(3000);
		
		//frame1 handle chesaka mainframe(default frame)ki velli malli frame2 ki shift avvali
		//frame2 handle chesaka malli frame 1 ki vellali ante mainframe(default frame)ki velli malli frame1 ki shift avvali
		
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("kiran");
		driver.findElement(By.id("lastName")).sendKeys("oruganti");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm1");
		
		courseName_dd.selectByVisibleText("Dot Net");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		
		driver.findElement(By.id("name")).sendKeys("code aipoindi");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
//		driver.switchTo().frame("frm1"); //frame1
//			
//		Select courseName_dd = new Select(driver.findElement(By.id("course")));
//		courseName_dd.selectByVisibleText("Java");
//		Thread.sleep(5000);
//		driver.switchTo().defaultContent();//Main document
//		
//		driver.switchTo().frame("frm2"); //frame2
//		driver.findElement(By.id("firstName")).sendKeys("Yadagiri");
//		Thread.sleep(5000);
//		driver.switchTo().defaultContent();//Main document
//		driver.switchTo().frame("frm1"); //frame1
//		
//		courseName_dd.selectByVisibleText("Dot Net");
//		Thread.sleep(5000);
//		
//		driver.switchTo().defaultContent();//Main document
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("Text2");
//	}
//}