package javaseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class logincdupage {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.chaitanyacolleges.com/cgcstudent/");
		driver.manage().window().maximize();
		
		WebElement admno=driver.findElement(By.name("admnno"));
		admno.sendKeys("20279");
		
		WebElement dropdown_d=driver.findElement(By.name("day"));
		Select day =new Select(dropdown_d);
		day.selectByValue("22");
		
		WebElement dropdown_m=driver.findElement(By.name("month"));
		Select month =new Select(dropdown_m);
		month.selectByValue("February");
		
		
		WebElement dropdown_y=driver.findElement(By.name("year"));
		Select year =new Select(dropdown_y);
		year.selectByValue("2003");
		
		WebElement login=driver.findElement(By.xpath("/html/body/div/div/div[2]/form/table/tbody/tr[4]/td[2]/input"));
		// to copy xpath select the login element  right click copy>copyxpath
		login.click();
		driver.quit();
		
		
		
	}

}
